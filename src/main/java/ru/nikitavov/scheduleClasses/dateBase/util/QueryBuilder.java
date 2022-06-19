package ru.nikitavov.scheduleClasses.dateBase.util;

import java.util.HashMap;
import java.util.Map.Entry;

public class QueryBuilder {

    private HashMap<String, String> whereParams = new HashMap<>();
    private String selectObject;
    private String fromObject;


    private QueryBuilder() {
    }

    public static QueryBuilder create() {
        return new QueryBuilder();
    }

    public QueryBuilder setSelectObject(String selectObject) {
        this.selectObject = selectObject;
        return this;
    }

    public QueryBuilder setFromObject(String fromObject) {
        this.fromObject = fromObject;
        return this;
    }

    public QueryBuilder addWhere(String paramName, Object param) {
        return addWhere(paramName, param, false);
    }

    public QueryBuilder addWhere(String paramName, Object param, boolean isText) {
        String paramString = param.toString();
        if (isText) {
            paramString = QueryHelper.textParam(paramString);
        }
        whereParams.put(paramName, paramString);
        return this;
    }

    public String build() {
        String queryString = "";
        queryString += "select " + selectObject + " ";
        queryString += "from " + fromObject;
        if (!whereParams.isEmpty()) {
            queryString += " where";
            StringBuilder whereString = new StringBuilder();
            if (whereParams.entrySet().size() == 1) {
                for (Entry<String, String> entry : whereParams.entrySet()) {
                    whereString.append(" ");
                    whereString.append(entry.getKey());
                    whereString.append(" = ");
                    whereString.append(entry.getValue());
                }
            } else {
                boolean first = true;
                for (Entry<String, String> entry : whereParams.entrySet()) {
                    if (first) {
                        whereString.append(" ");
                        whereString.append(entry.getKey());
                        whereString.append(" = ");
                        whereString.append(entry.getValue());
                        first = false;
                        continue;
                    }
                    whereString.append(" and ");
                    whereString.append(entry.getKey());
                    whereString.append(" = ");
                    whereString.append(entry.getValue());
                }
            }
            queryString += whereString.toString();
        }
        return queryString;
    }
}
