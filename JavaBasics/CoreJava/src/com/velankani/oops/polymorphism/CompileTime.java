/**
 * 
 */
package com.velankani.oops.polymorphism;

/**
 * @author ${Ashish Mamgain} 07-Jan-2020
 */
//Java program to illustrate the
//concept of polymorphism
class Overload {
	void demo(int a) {
		System.out.println("a: " + a);
	}

	void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}

	double demo(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}

class CompileTime {
	public static void main(String args[]) {
		Overload Obj = new Overload();
		double result;
		Obj.demo(10);
		Obj.demo(10, 20);
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
	}
}