/**
 * 
 */
package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain}
 * 08-Jan-2020
 */
// Java program to demonstrate working of chained exceptions
/*
 * getCause() method :- This method returns actual cause of an exception.
 * initCause(Throwable cause) method :- This method sets the cause for the
 * calling exception.
 */
public class ChainedException {
	public static void main(String[] args) {
		try {
			// Creating an exception
			NumberFormatException ex = new NumberFormatException("Exception");

			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			// Throwing an exception with cause.
			throw ex;
		}

		catch (NumberFormatException ex) {
			// displaying the exception
			System.out.println(ex);

			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}
	}
}