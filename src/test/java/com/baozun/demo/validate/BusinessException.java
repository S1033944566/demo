package com.baozun.demo.validate;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/31 16:11
 */
public class BusinessException extends Exception {

    private String message;

    private int error;

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
