package exceptionHandling;

import java.io.FileNotFoundException;



public class CheackedAndUnchecked {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("UnChecked Exception - ArrayIndexOutOfBound");
		int arr[]= {1,2,3};
		try {
			System.out.println(arr[8]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of Bound");
		}
		System.out.println("-------------------------------------");
		
		System.out.println("Checked exception");
		try {
			//Class temp =Class.forName("exceptionHandling.Demo"); 
			//I've created Demo file for this
			
			
			Class temp=Class.forName("exceptionHandling.Demo2");
			
			System.out.println("Class is present "+temp.getName());
			
		}catch(ClassNotFoundException c) {
			System.out.println("Class doesn't exists");
		}
		
	}

}




//Q3: Write a program that showcases the difference between 
//unchecked and checked exceptions. 
//Use both types of exceptions in separate scenarios 
//and demonstrate how they are handled differently.


