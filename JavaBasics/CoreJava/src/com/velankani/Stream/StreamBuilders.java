/**
 * 
 */
package com.velankani.Stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ${Ashish Mamgain}
 * 21-Jan-2020
 */
public class StreamBuilders {
	public static void main(String[] args) {
		// Stream.generate() or Stream.iterate()
		Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		});
		stream.forEach(p -> System.out.println(p));
	}
}