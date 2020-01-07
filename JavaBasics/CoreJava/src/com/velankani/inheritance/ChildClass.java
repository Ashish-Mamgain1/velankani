package com.velankani.inheritance;

/**
 * @author ${Ashish Mamgain} 07-Jan-2020
 */
//Java program to illustrate the
//concept of Inheritance
class ParentClass {
	// Parent class constructor
	ParentClass() {
		System.out.println("Constructor of Parent");
	}
}

class ChildClass extends ParentClass {
	// Child class constructor
	ChildClass() {

		System.out.println("Constructor of Child");
	}

	public static void main(String args[]) {

		new ChildClass();
	}
}