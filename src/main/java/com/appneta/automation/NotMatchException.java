package com.appneta.automation;

public class NotMatchException extends Exception {

	 //Parameterless Constructor
    public NotMatchException() {}

    //Constructor that accepts a message
    public NotMatchException(String message)
    {
       super(message);
    }
}
