package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain}
 * 08-Jan-2020
 */
/* Cause for Null pointer Exception: *
 *Accessing or modifying a null object’s field.
 *Taking the length of null, as if it were an array.
 *Accessing or modifying the slots of null object, as if it were an array.
 *Throwing null, as if it were a Throwable value.
 *When you try to synchronize over a null object. *
*/

//A Java program to demonstrate that we can avoid 
//NullPointerException 
import java.io.*;

public class NullPointerExceptionProg {
	public static void main(String[] args) {
		// Initialing String variable with null value
		String ptr = null;

		// Checking if ptr is null using try catch.
		try {
			if (ptr.equals("gfg"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		} catch (NullPointerException e) {
			System.out.print("Caught NullPointerException");
		}
	}
}