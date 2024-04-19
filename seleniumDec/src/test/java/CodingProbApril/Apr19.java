package CodingProbApril;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Apr19 {

	
	public static void removeDupli(String s) {
		
		Set<Character> se = new LinkedHashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			
			se.add(s.charAt(i));
			
		}
		
		System.out.println(se);
		
	}
	
	
	public static void maxChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		char result = 0;
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				if(count<map.get(s.charAt(i))) {
					count = map.get(s.charAt(i));
					result = s.charAt(i);
				}
			}
			else {
				map.put(s.charAt(i), 1);
			}
			
		}
		System.out.println(result);
		for(Entry<Character, Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>=2) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}
	
	
	public static void nonRepeatChar(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
			
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*


How do you convert a given String into int like the atoi()? (solution)
How do you reverse words in a given sentence without using any library method? (solution)
How do you check if two strings are a rotation of each other? (solution)
How do you find the length of the longest substring without repeating characters? (solution)
Given string str, How do you find the longest palindromic substring in str? (solution)
How to convert a byte array to String? (solution)

How do you print the first non-repeated character from a string? (solution)
how to remove the duplicate character from String? (solution)
How to find the maximum occurring character in given String? (solution)
*/
		
		
	//	removeDupli("mathumathi");
	//	maxChar("mathumathit");
		nonRepeatChar("mathumathi");
		
		
	}

}
