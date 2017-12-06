package com.declarative.exception;

//Custom Exception created for Checking the Spting Transaction Attributes
public class JobNotCreatedException extends Exception{
   public JobNotCreatedException(String message) {
	   super(message);
   }
}
