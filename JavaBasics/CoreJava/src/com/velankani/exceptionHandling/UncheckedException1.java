/**
 * 
 */
package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain} 
 * 08-Jan-2020
 * 
 * Unchecked Exceptions are
 * NullPointerException
 * ArrayIndexOutOfBoundsException 
 * ArithmeticException
 * IllegalArgumentException 
 * NumberFormatException
 * 
 */
public class UncheckedException1 {

	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 0;
		/*
		 * Since I'm dividing an integer with 0 it should throw
		 * ArithmeticException
		 */
		double res = num1 / num2;
		System.out.println(res);
	}
}
