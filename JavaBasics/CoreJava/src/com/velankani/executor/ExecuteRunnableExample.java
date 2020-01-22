package com.velankani.executor;

/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
**/
// The Java ExecutorService execute(Runnable) method takes a java.lang.Runnable object,
// and executes it asynchronously. 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;

public class ExecuteRunnableExample {
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});

		executorService.shutdown();

	}
}