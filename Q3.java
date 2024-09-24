package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Q3 {
	static final int THRESHOLD =5;
	
	static class Quicksort extends RecursiveAction{
		int[] arr;
		int left,right;
		
		Quicksort(int arr[], int left, int right){
			this.arr=arr;
			this.left=left;
			this.right=right;
		}
		
		@Override
		protected void compute() {
			if(right-left>THRESHOLD) {
				int pivot=partition(arr,left,right);
				Quicksort l=new Quicksort(arr,left,pivot-1);
				Quicksort r=new Quicksort(arr,pivot+1,right);
				invokeAll(l,r);
			}else {
				seqQuicksort(arr,left,right);
			}
		}
		private void seqQuicksort(int[] array, int left, int right) {
            if (left<right) {
                int pivotIndex = partition(array, left, right);
                seqQuicksort(array, left, pivotIndex - 1);
                seqQuicksort(array, pivotIndex + 1, right);
            }
        }

        private int partition(int[] arr, int left, int right) {
            int pivot=arr[right];
            int i=left-1;
            
            for (int j=left;j<right;j++) {
                if (arr[j]<=pivot) {
                    i++;
                    swap(arr,i,j);
                }
            }
            
            swap(arr,i+1,right);
            return i+1;
        }

        private void swap(int[] arr,int i,int j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
		
		
	}

	public static void main(String[] args) {
		int arr[]= {5,3,7,2,8,10,59,46,14,1,67};
		ForkJoinPool pool=new ForkJoinPool();
		pool.invoke(new Quicksort(arr,0,arr.length-1));
		pool.shutdown();
		System.out.println("Sorted list is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

/*Q3: Implement a parallelized version of a recursive algorithm using Java's Fork-Join framework (e.g., merge sort or quicksort)*/
