package com.velankani.executor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
 */

// The invokeAny() method takes a collection of Callable objects, or
// subinterfaces of Callable. Invoking this method does not return a Future, but
// returns the result of one of the Callable objects
public class invokeAnyExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 1";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 2";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 3";
			}
		});

		String result = executorService.invokeAny(callables);

		System.out.println("result : " + result);

		executorService.shutdown();
	}
}
