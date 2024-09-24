package multithreading;


class Task1 implements Runnable{
	 ThreadLocal<Integer> local=new ThreadLocal();
	int i;
	Task1(int i){
		this.i=i;
	}

	@Override
	public void run() {
		local.set(i);
		System.out.println(Thread.currentThread().getName()+ " has value of "+local.get());
		local.remove();
		
	}
	
}

public class Q7 {
	
	public static void main(String[] args) {
		//ThreadLocal local=new ThreadLocal();
		Thread t1=new Thread(new Task1(1));
		Thread t2=new Thread(new Task1(2));
		Thread t3=new Thread(new Task1(3));
		Thread t4=new Thread(new Task1(4));
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		

	}

}
/*Write a program that uses ThreadLocal to maintain a unique value for each thread
 *  and demonstrate its use in a multithreaded environment.*/

