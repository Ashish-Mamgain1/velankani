package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain} 
 * 08-Jan-2020
 * 
 *Unchecked Exceptions are 
 *NullPointerException
 *ArrayIndexOutOfBoundsException 
 *ArithmeticException
 *IllegalArgumentException 
 *NumberFormatException
 * 
 */
public class UncheckedException2 {

	public static void main(String args[]) {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The specified index does not exist " + "in array. Please correct the error.");
		}
	}
}
