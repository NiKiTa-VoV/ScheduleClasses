package ru.nikitavov.scheduleClasses;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ru.nikitavov.scheduleClasses.grpc.impl.*;
import ru.nikitavov.scheduleClasses.schedule.DefaultScheduleHandler;

import java.io.IOException;

public class ScheduleClassesServer {

    private Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        DefaultScheduleHandler.init();
        final ScheduleClassesServer server = new ScheduleClassesServer();
        server.start();
        server.blockUntilShutdown();
    }

    public void start() throws IOException {
        int port = 8080;
        server = ServerBuilder.forPort(port)
                .addService(new UserGrpcImpl())
                .addService(new TeacherGrpcImpl())
                .addService(new SpecializationGrpcImpl())
                .addService(new DepartmentGrpcImpl())
                .addService(new GroupGrpcImpl())
                .addService(new SubjectGrpcImpl())
                .addService(new CurriculumGrpcImpl())
                .addService(new ClassRoomGrpcImpl())
                .addService(new ScheduleGrpcHandler())
                .addService(new LessonGrpcImpl())
                .addService(new ReportsGrpcImpl())
                .build()
                .start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            ScheduleClassesServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
