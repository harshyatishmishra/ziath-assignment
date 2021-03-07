package com.ziath.exception;

public abstract class BaseException extends RuntimeException {
    public BaseException(String msg, Throwable cause) {
        super(msg, cause);
    }
    public BaseException(String msg) {
        super(msg);
    }
}
