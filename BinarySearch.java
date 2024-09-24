package dataStructure;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {19,2,56,7,10,26,13};
		int search=10;
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		
		
		boolean flag=false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				System.out.println("Found");
				flag=true;
				break;
			}
			if(search>arr[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(!flag) {
			System.out.println("Not found");
		}

	}

}
//binarySearch
