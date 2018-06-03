package com.luxoft.sdemenkov.db.api;

import java.util.Map;
import java.util.Objects;

public final class Request {
    private CommandType commandType;
    private TargetType targetType;
    private Map<String, String> requestParametersMap;

    public Request() {
    }

    public Request(CommandType commandType, TargetType targetType, Map<String, String> requestParametersMap) {
        this.commandType = commandType;
        this.targetType = targetType;
        this.requestParametersMap = requestParametersMap;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public TargetType getTargetType() {
        return targetType;
    }

    public Map<String, String> getRequestParametersMap() {
        return requestParametersMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return commandType == request.commandType &&
                targetType == request.targetType &&
                Objects.equals(requestParametersMap, request.requestParametersMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commandType, targetType, requestParametersMap);
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public void setRequestParametersMap(Map<String, String> requestParametersMap) {
        this.requestParametersMap = requestParametersMap;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{");
        sb.append("commandType=").append(commandType);
        sb.append(", targetType=").append(targetType);
        sb.append(", requestParametersMap=").append(requestParametersMap);
        sb.append('}');
        return sb.toString();
    }
}
