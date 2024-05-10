package org.exception;

public class InvalidEmailException extends Exception{
    public String message;

    public InvalidEmailException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage()
    {
        return message;
    }
}
