package com.luxoft.sdemenkov.db.api;

import java.util.List;

public class Response {
    private List<String> messageList;
    private SelectResult result;

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

    public SelectResult getResult() {
        return result;
    }

    public void setResult(SelectResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("messageList=").append(messageList);
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
