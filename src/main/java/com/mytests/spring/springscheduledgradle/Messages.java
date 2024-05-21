package com.mytests.spring.springscheduledgradle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Messages {
    @Id
    @GeneratedValue
    private Integer id;

    String message;
    Timestamp timestamp;
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Messages(String message, Timestamp timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public Messages() {
    }

    @Override
    public String toString() {
        return "Messages{" +
               "id=" + id +
               ", message='" + message + '\'' +
               ", timestamp=" + timestamp +
               '}';
    }
}
