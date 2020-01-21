package com.velankani.Stream;

import java.util.stream.Stream;
/**
 * @author ${Ashish Mamgain}
 * 21-Jan-2020
 */
/*Stream.peek() is an intermediate operation, i.e. it does not end the processing of the stream*/
public class PeekDemo {
	public static void main(String args[]) {
		Stream.iterate(1, (Integer n) -> n + 1).peek(n -> System.out.println("number generated: - " + n))
				.filter(n -> (n % 2 == 0)).peek(n -> System.out.println("Even number filter passed for - " + n))
				.limit(5).count();
	}
}