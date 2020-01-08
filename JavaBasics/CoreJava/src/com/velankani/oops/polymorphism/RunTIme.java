/**
 * 
 */
package com.velankani.oops.polymorphism;

/**
 * @author ${Ashish Mamgain} 07-Jan-2020
 */
//Java program to illustrate the
//concept of polymorphism
class Animal {
	public void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Horse extends Animal {
	@Override
	public void sound() {
		System.out.println("Neigh");
	}

}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Meow");
	}

}

public class RunTIme {
	public static void main(String args[]) {
		Animal obj1 = new Animal();
		Animal obj2 = new Horse();
		Animal obj3 = new Cat();
		obj1.sound();
		obj2.sound();
		obj3.sound();
	}
}
