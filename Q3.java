package multithreading;

import java.util.Arrays;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list=Arrays.asList(arr);
		int odd=0,even=0;
		Thread t1=new Thread(){
			
			public void run() {
				System.out.println("Even numbers in list: ");
				for(int i=0;i<list.size();i++) {
					if(list.get(i)%2==0) {
						System.out.print(list.get(i)+" ");
					}
				}
				System.out.println();
			}
			
		};
		
		Thread t2=new Thread(){
			public void run() {
				System.out.println("Odd numbers in list: ");
				for(int i=0;i<list.size();i++) {
					if(list.get(i)%2!=0) {
						System.out.print(list.get(i)+" ");
						//odd=odd+list.get(i);
					}
				}
				System.out.println();
			}
			
		};
		
		Thread t3=new Thread(){
			public void run() {
				System.out.println("Sum of even and odd numbers in list: ");
				int sum=0;
				for(int i=0;i<list.size();i++) {
					sum+=list.get(i);
						
				}
				System.out.println(sum);
			}
			
		};
		
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}catch(InterruptedException e) {
			System.out.println("Interrupted Exception occured!!");
		}
		
		
		

	}

}
/*Write a program with three threads.
 *  First thread should print Even numbers,
 *   Second thread should print Odd Numbers, 
 *   third thread should print sum of odd and even numbers. 
 *   Above threads should print in a sequential manner.*/
 