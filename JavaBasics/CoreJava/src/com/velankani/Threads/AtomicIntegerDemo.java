package com.velankani.Threads;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * @author ${Ashish Mamgain}
 * 10-Jan-2020
 */
public class AtomicIntegerDemo {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(100);

		System.out.println(atomicInteger.addAndGet(2)); // 102
		System.out.println(atomicInteger); // 102

		System.out.println(atomicInteger.getAndAdd(2)); // 102
		System.out.println(atomicInteger); // 104

		System.out.println(atomicInteger.incrementAndGet()); // 105
		System.out.println(atomicInteger); // 105

		System.out.println(atomicInteger.getAndIncrement()); // 105
		System.out.println(atomicInteger); // 106

		System.out.println(atomicInteger.decrementAndGet()); // 105
		System.out.println(atomicInteger); // 105

		System.out.println(atomicInteger.getAndDecrement()); // 105
		System.out.println(atomicInteger); // 104
	}
}