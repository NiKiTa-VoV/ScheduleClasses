// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lesson.proto

package ru.nikitavov.scheduleClasses.grpc;

public interface ReadAvailableLessonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lesson.ReadAvailableLessonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 subjectId = 1;</code>
   */
  long getSubjectId();

  /**
   * <code>int64 groupId = 2;</code>
   */
  long getGroupId();

  /**
   * <code>int64 teacherId = 3;</code>
   */
  long getTeacherId();

  /**
   * <code>int64 roomId = 4;</code>
   */
  long getRoomId();

  /**
   * <code>int64 lessonNumber = 5;</code>
   */
  long getLessonNumber();
}