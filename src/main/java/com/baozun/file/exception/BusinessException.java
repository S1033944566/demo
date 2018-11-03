package com.baozun.file.exception;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 11:08
 */
public class BusinessException extends Exception {

    private int errorCode;

    private String msg;

    public BusinessException(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public BusinessException() {
        super();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
