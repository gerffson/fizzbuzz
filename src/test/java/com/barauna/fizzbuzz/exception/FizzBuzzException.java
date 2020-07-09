package com.barauna.fizzbuzz.exception;

public class FizzBuzzException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FizzBuzzException() {
		super();
	}

	public FizzBuzzException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FizzBuzzException(String message, Throwable cause) {
		super(message, cause);
	}

	public FizzBuzzException(String message) {
		super(message);
	}

	public FizzBuzzException(Throwable cause) {
		super(cause);
	}
	

}
