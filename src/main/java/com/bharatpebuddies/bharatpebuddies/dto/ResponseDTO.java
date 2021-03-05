package com.bharatpebuddies.bharatpebuddies.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResponseDTO<T> {
    public boolean success;
    public String statusCode;
    public String message = null;
    public T data;

    public ResponseDTO(String responseCode, String message, boolean status) {
        this.statusCode = responseCode;
        this.message = message;
        this.success = status;
    }

    public ResponseDTO(String responseCode, String message, boolean status, T data) {
        this.statusCode = responseCode;
        this.message = message;
        this.success = status;
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ResponseDTO [success=" + success + ", statusCode=" + statusCode + ", message=" + message + ", data="
                + data + "]";
    }

}