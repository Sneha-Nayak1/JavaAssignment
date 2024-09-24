package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++) {
			list.add(s.nextInt());
		}
		
		Collections.sort(list);
		
		int i=0;
		while(i<list.size()-1) {
			if(list.get(i)==list.get(i+1)) {
				list.remove(i);
			}else {
				i++;
			}
		}

		System.out.println(list);

	}

}


//Q4: Write a program to find and remove duplicate elements 
//from an ArrayList without using any additional data structures.
//The goal is to achieve this with optimal time and space complexity.	