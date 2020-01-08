package com.velankani.exceptionHandling;
/**
 * @author ${Ashish Mamgain}
 * 08-Jan-2020
 */

// A Class that represents use-defined expception 
class MyException1 extends Exception {

	// The constructor of Exception class can also be called without a parameter
	// and call to super is not mandatory.

}

// A Class that uses above MyException
public class CustomException1 {
	// Driver Program
	public static void main(String args[]) {
		try {
			// Throw an object of user defined exception
			throw new MyException1();
		} catch (MyException1 ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}