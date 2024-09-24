package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class Task implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Hello";
	}
	
}

public class Q2 {
	static final int max_thread=3;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService es = Executors.newFixedThreadPool(max_thread);
		Future f=es.submit(new Task());
		System.out.println(f.get());
		es.shutdown();
		
		
		

	}

}
/* Write Program to implement your own threadpool and 
 * implement class to take runnable and able to submit task.*/
 