package org.exception;

public class InvalidMobileNumberException extends Exception {

    public String message;

    public InvalidMobileNumberException(String message)
    {
      this.message=message;
    }

    public String getMessage()
    {
        return message;
    }
}
