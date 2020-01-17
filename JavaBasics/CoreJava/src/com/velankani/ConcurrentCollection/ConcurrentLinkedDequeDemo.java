package com.velankani.ConcurrentCollection;

/**
 * @author ${Ashish Mamgain}
 * 17-Jan-2020
 */

// Java Program to demonstrate ConcurrentLinkedDeque 

import java.util.concurrent.*;

public class ConcurrentLinkedDequeDemo {
	public static void main(String[] args) {
		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque() contructor
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		cld.addFirst(12);
		cld.addFirst(70);
		cld.addFirst(1009);
		cld.addFirst(475);

		// Displaying the existing LinkedDeque
		System.out.println("ConcurrentLinkedDeque: " + cld);

		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque(Collection c) contructor
		ConcurrentLinkedDeque<Integer> cld1 = new ConcurrentLinkedDeque<Integer>(cld);

		// Displaying the existing LinkedDeque
		System.out.println("ConcurrentLinkedDeque1: " + cld1);
	}
}