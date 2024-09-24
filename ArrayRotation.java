package dataStructure;

import java.util.Scanner;

public class ArrayRotation {
	
	public static void rotate(int arr[], int i, int j) {
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Enter K value: ");
		int k=s.nextInt();
		//for(int i=0;i<k;i++) {
		k=k%arr.length;
		rotate(arr,0,arr.length-1);
		rotate(arr,0,k-1);
		rotate(arr,k,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}

}


//Write a program to rotate an array of n elements to the right by k steps.


