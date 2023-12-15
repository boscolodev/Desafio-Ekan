package com.hexagonalddd.hexagonalarchtecture.shared.exceptions;

public class DatabaseNotFoundException extends RuntimeException{
    public DatabaseNotFoundException(String message) {
        super(message);
    }
}
