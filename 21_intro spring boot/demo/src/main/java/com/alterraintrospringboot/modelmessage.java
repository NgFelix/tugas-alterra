package com.alterraintrospringboot.demo;

public class modelMessage {
    private Boolean success;
    private String message;
    private String data;

    public void setSucces(Boolean success) {
        this.succes = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getSucces() {
        return succes;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }
}