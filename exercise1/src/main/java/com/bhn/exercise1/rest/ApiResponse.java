package com.bhn.exercise1.rest;

import java.io.Serializable;

/**
 * Created by djeremias on 3/7/17.
 */
public class ApiResponse<T> implements Serializable {

    private String message;

    private T payload;

    public ApiResponse() {
        // empty ctor
    }

    public ApiResponse(String message, T payload) {
        this.message = message;
        this.payload = payload;
    }

    public ApiResponse(T payload) {
        this.payload = payload;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
