/**
 * 
 */
package com.velankani.Threads;

/**
 * @author ${Ashish Mamgain}
 * 09-Jan-2020
 */
//Java program to illustrate yield() method 
//in Java 
import java.lang.*;

//MyThread extending Thread 
class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
}

// Driver Class
public class YieldDemo {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();

		for (int i = 0; i < 5; i++) {
			// Control passes to child thread
			Thread.yield();

			// After execution of child Thread
			// main thread takes over
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}
