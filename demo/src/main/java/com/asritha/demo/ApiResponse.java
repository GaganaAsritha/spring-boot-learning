package com.asritha.demo;

public class ApiResponse<T> {

    public int status;
    public T data;

    public ApiResponse(int status, T data){
        this.status = status;
        this.data = data;
    }
}