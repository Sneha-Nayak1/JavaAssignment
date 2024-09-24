package collections1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class SortingString {
	static class Comp implements Comparator<Character>{

		@Override
		public int compare(Character c1, Character c2) {
			// TODO Auto-generated method stub
			
			return c2.compareTo(c1);
		}
		
	}
	public static String reverse1(String s) {
		//char arr[]=s.toCharArray();
		Character arr[]= s.chars().mapToObj(c->(char) c).toArray(Character[]::new);
		Arrays.sort(arr, new Comp());
		char[] arr2=new char[arr.length];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i];
		}
		return new String(arr2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		List<String> list=new ArrayList<>();
		System.out.println("Enter 5 fruit names");
		for(int i=0;i<5;i++) {
			list.add(s.next());
		}
		
		for(int i=0;i<list.size();i++) {
			String str=reverse1(list.get(i));
			list.set(i, str);
		}
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);

	}

}


// Write a program to sort the String characters 
//and the strings in a List<String>. 
//sorting has to be done in decending order using comparator.  


