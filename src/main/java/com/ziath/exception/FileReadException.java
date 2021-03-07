package com.ziath.exception;

public class FileReadException extends BiologicalServiceException {
    public FileReadException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
