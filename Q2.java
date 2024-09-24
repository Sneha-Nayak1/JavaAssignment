package exceptionHandling;

import java.util.Scanner;

class InvalidInputException1 extends Exception{
	public InvalidInputException1(String s){
		super(s);
	}
}

public class Q2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= s.nextInt();
		try {
			if(n<=0) {
				throw new InvalidInputException1("Error");
			}else {
				System.out.println("Its a positive number");
			}
		}catch(InvalidInputException1 e) {
			System.out.println(e);
		}

	}

}

//Q2: Create a custom exception named InvalidInputException. 
//Write a program that takes user input for a positive integer. 
//If the input is negative or zero, 
//throw an InvalidInputException with an appropriate error message