package com.lotto.lotto.exception;

public class MyAccountNotFoundException extends RuntimeException {
    public MyAccountNotFoundException(String format) {
        super(format);
    }
}
