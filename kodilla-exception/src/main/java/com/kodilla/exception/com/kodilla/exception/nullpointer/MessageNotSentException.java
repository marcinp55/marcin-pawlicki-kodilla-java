package com.kodilla.exception.com.kodilla.exception.nullpointer;

public class MessageNotSentException extends Exception{
    public MessageNotSentException(final String message) {
        super(message);
    }
}
