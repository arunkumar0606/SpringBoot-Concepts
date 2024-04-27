package com.example.RabbitMq.Entity;


import lombok.*;



public class Message {
    private String name;
    private String message;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
