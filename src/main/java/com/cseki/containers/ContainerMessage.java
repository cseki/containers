package com.cseki.containers;

import java.time.LocalDateTime;

public class ContainerMessage {

    String id;
    Long counter;
    String message;
    LocalDateTime timeStamp;

    public ContainerMessage(String id, String message, Long counter, LocalDateTime timeStamp) {
        this.id = id;
        this.message = message;
        this.counter = counter;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Long getCounter() {
        return counter;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
