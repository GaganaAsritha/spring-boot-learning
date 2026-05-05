package com.asritha.demo;

public class ApiResponse<T> {

    public int status;
    public T data;
    public Object errors;

    public ApiResponse(int status, T data, Object errors){
        this.status = status;
        this.data = data;
        this.errors = errors;
    }
}