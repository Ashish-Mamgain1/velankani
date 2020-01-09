/**
 * 
 */
package com.velankani.Threads;

/**
 * @author ${Ashish Mamgain}
 * 09-Jan-2020
 */

// Java program to demonstrate deadlock
// using Main thread
public class DeadlockExample {
	public static void main(String[] args) {
		try {

			System.out.println("Entering into Deadlock");

			Thread.currentThread().join();

			// the following statement will never execute
			System.out.println("This statement will never execute");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}