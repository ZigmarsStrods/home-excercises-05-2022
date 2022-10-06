package io.codelex.exceptions.practice.exercise4;

public class NonPositiveNumberException extends IllegalArgumentException {

    public NonPositiveNumberException() {
    }

    public NonPositiveNumberException(String message) {
        super(message);
    }

}
