package com.velankani.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
 */
// The Java ExecutorService submit(Runnable) method also takes a Runnable
// implementation, but returns a Future object. This Future object can be used
// to check if the Runnable has finished executing.
public class SubmitCallableExample {
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(new Callable(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous Callable");
		        return "Callable Result";
		    }
		});

		System.out.println("future.get() = " + future.get());


	}
}
