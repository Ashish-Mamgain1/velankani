package com.velankani.exceptionHandling;

import java.io.IOException;

/**
 * @author ${Ashish Mamgain} 08-Jan-2020
 */

// Java program to illustrate exception propagation
// in checked exceptions and it can be propagated
// by throws keyword ONLY

class ExceptionPropogation {

	// exception propagated to n()
	void m() throws IOException {
		// checked exception occurred
		throw new IOException("device error");
	}

	// exception propagated to p()
	void n() throws IOException {
		m();
	}

	void p() {
		try {
			// exception handled
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		System.out.println("normal flow...");
	}
}