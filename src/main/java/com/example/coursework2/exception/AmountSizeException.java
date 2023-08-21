package com.example.coursework2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountSizeException extends Throwable {
    public AmountSizeException() {
    }

    public AmountSizeException(String message) {
        super(message);
    }

    public AmountSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountSizeException(Throwable cause) {
        super(cause);
    }

    public AmountSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
