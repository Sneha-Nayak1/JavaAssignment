package dataStructure;

import java.util.Scanner;

public class SortingAlgo {
	
	public static void bubbleSortAlgo(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 printRes(arr);
		
	}
	
	public static void quickSortAlgo(int arr[], int low, int high) {
		
		if(low<high) {
			int part=partition(arr,low,high);
			quickSortAlgo(arr,low,part-1);
			quickSortAlgo(arr,part+1,high);
			//printRes(arr);
			
		}
	}
	
	public static  int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

	public static void mergeSortAlgo(int arr[],int left, int right) {
	if(left<right) {
		int middle=(left+(right-1))/2;
		mergeSortAlgo(arr,left,middle);
		mergeSortAlgo(arr,middle+1,right);
		
		merge(arr,left,middle,right);
		
	}
}
	
	public static void merge(int arr[], int left, int middle, int right) {
		
		int size1=middle-left+1;
		int size2=right-middle;
		
		int arrL[]=new int[size1];
		int arrR[]=new int[size2];
		System.arraycopy(arr, left, arrL, 0, size1);
	    System.arraycopy(arr, middle + 1, arrR, 0, size2);
		
		for(int i=0;i<size1;i++) 
			arrL[i]=arr[left+i];
		for(int j=0;j<size1;j++) 
				arrR[j]=arr[middle+1+j];
		
				
		int i=0,j=0;
		int k=left;
		while(i<size1 && j<size2) {
			if(arrL[i]<=arrR[j]) {
				arr[k]=arrL[i];
				i++;
			}
			else {
				arr[k]=arrR[j];
				j++;
			}
			k++;
		}
		
		while(i<size1) {
			arr[k]=arrL[i];
			i++;
			k++;
		}
		
		while(j<size2) {
			arr[k]=arrR[j];
			j++;
			k++;
		}
		
			
	}	

	
	public static void printRes(int arr[]) {
		System.out.println("The sorteds array is: ");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 integer values: ");
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter sorting type \n(Type B for BUBBLE \nor Type Q QUICK \n or Type M MERGE):");
		String c=s.next();
		
		long start,end,duration;
		switch(c) {
		case "B":  start=System.nanoTime();
				   bubbleSortAlgo(arr);
				   end=System.nanoTime();
				   duration=end-start;
				   System.out.println("Time taken by Bubblesort algorithm is : "+duration+" nano second.");
				   break;
				   
		case "Q":  start=System.nanoTime();
		   		   quickSortAlgo(arr,0,arr.length-1);
		           end=System.nanoTime();
		           printRes(arr);
		           duration=end-start;
				   System.out.println("Time taken by Quicksort algorithm is : "+duration+" nano second.");
		           break;
		   
		case "M":  start=System.nanoTime();
		           mergeSortAlgo(arr,0,arr.length-1);
		           end=System.nanoTime();
		           printRes(arr);
		           duration=end-start;
				   System.out.println("Time taken by Mergesort algorithm is : "+duration+" nano second.");
		           break;
		           
	    default:  System.out.println("Enter crect algo");
		}
		
		
	}

}


/*Q1:Design an application that takes the type of sorting algorithm 
 * (like BUBBLE, QUICK, MERGE etc ) and integer values to sort from command line, 
 * there maybe few strings as well which are to be neglected by the program,
 *  and then sorts the values as per the algorithm and return the sorted values?  
 *  Also find the time utilization for the sort? Which sort is better?	*/


 