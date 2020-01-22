package com.velankani.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author ${Ashish Mamgain}
 * 22-Jan-2020
 */
class LoopTask implements Runnable {
	 
	private String loopTaskName;
	
	public LoopTask(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}
 
	@Override
	public void run() {
		System.out.println("Starting "+loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing "+loopTaskName+" with "+Thread.currentThread().getName()+"===="+i);
		}
		System.out.println("Ending "+loopTaskName);
	}
}

 
public class SingleThreadPoolDemo {
 
	public static void main(String args[])
	{
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		for (int i = 1; i <= 3; i++) {
			LoopTask loopTask=new LoopTask("LoopTask "+i);
			es.submit(loopTask);
		}
		es.shutdown();
	}
}
 