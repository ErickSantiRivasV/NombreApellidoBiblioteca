package Exceptions;

public class InvalidBorrowAttempException extends RuntimeException {
    public InvalidBorrowAttempException(String message) {
        super(message);
    }
}
