package collections1;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Q6 {

	public static void process(String line,ConcurrentHashMap<String, Integer> map ) {
		String[] words=line.split("\\s+");
		for(String word:words) {
			word=word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
			if(!word.isEmpty()) {
				map.merge(word, 1, Integer::sum);
			}
		}
	}
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter paragraph");
		while(s.hasNextLine()) {
			String line=s.nextLine();
			 if (line.isEmpty()) {
	                break; 
	            }
			process(line,map);
			
		}
		System.out.println("Frequency of words are: ");
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() +" --> "+entry.getValue());
		}
	

	}

}

/*Q6: Implement a program that counts the frequency of words in a given text
 *  using a ConcurrentHashMap. Ensure that the program efficiently handles 
 *  concurrent read and write operations without using external locks. input 
 *  to program can be mutiple paragraphs at a time.*/
