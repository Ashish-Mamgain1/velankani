package com.velankani.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
 */
// The Java ExecutorService submit(Runnable) method also takes a Runnable
// implementation, but returns a Future object. This Future object can be used
// to check if the Runnable has finished executing.
public class SubmitRunnableExample {
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});

		future.get(); // returns null if the task has finished correctly.

	}
}
