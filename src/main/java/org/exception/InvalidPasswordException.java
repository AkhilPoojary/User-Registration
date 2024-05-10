package org.exception;

public class InvalidPasswordException extends Exception{

    public String message;

    public InvalidPasswordException(String message)
    {
        this.message=message;
    }

    public String getMessage()
    {
        return message;
    }
}
