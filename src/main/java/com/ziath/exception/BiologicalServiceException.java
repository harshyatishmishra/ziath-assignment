package com.ziath.exception;

public class BiologicalServiceException extends BaseException {
    public BiologicalServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
    public BiologicalServiceException(String msg) {
        super(msg);
    }
}
