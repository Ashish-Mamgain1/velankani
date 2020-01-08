/**
 * 
 */
package com.velankani.exceptionHandling;

/**
 * @author ${Ashish Mamgain}
 * 08-Jan-2020
 */

/*
 * In case of double/float division, the output is Infinity, the basic reason
 * behind that it implements the floating point arithmetic algorithm which
 * specifies a special values like “Not a number” OR “infinity” for “divided by
 * zero cases” as per IEEE 754 standards.
 */
public class Infinity {

	public static void main(String[] args) {
		double p = 1;
		System.out.println(p / 0);
	}
}
