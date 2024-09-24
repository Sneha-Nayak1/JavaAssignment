package multithreading;

class A extends Thread{
	@Override
	public void run() {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum is: "+sum);
	}
}

class B extends Thread{
	@Override
	public void run() {
		int arr[]= {6,7,8,9,10};
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
		}
		System.out.println("Product is: "+product);
	}
}

class C extends Thread{
	@Override
	public void run() {
		int arr[]= {1,2,3,4,5};
		System.out.println("Even numbers are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}
public class Q1 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		
		try {
			c.start();
			c.join();
			a.start();
			a.join();
			b.start();
			b.join();
		}catch(InterruptedException e) {
			
		}
		

	}

}
/*Write a program to synchronize a flow of a program using 
 * Multithreading concepts?[using join()]*/
 