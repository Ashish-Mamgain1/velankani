package com.velankani.executor;

/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
**/
// The invokeAll() method invokes all of the Callable objects you
// pass to it in the collection passed as parameter. 
// The invokeAll() returns a list of Future objects via which you can 
// obtain the results of the executions of each Callable.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;

public class invokeAllExample {
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

		List<Future<String>> futures = executorService.invokeAll(callables);

		for (Future<String> future : futures) {
			System.out.println("future.get = " + future.get());
		}

		executorService.shutdown();
	}
}