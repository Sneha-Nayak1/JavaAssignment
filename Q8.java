package dataStructure;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=s.next();
		
		Map<Character, Integer> map=new HashMap<>();
		char arr[]=input.toCharArray();
		
		for(char c:arr) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		//System.out.println(map);
		
		for(char c: arr) {
			if(map.get(c)==1) {
				System.out.println("The first non repeating element is: "+ c);
				break;
			}
		}
		

	}

}


//Write a Program to find the first non-repeating character in a string.