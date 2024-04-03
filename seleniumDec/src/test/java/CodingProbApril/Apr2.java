package CodingProbApril;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Apr2 {

	
	public static void anagram(String s1, String s2) {
		boolean isAnagram = true;
		if(s1.length()!=s2.length()) {
			
			isAnagram = false;
			
			}
		else {
			
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			isAnagram = Arrays.equals(s1Array, s2Array);
			
		}
		
if(isAnagram) {
	System.out.println(s1 + " , " +s2 + " - Given words are anagram");
}
else System.out.println(s1 + " , " +s2 +" - No, those words are not anagram");
		
	}
	
	public static void removeDuplicates(String s) {
		
		Set<Character> s1 = new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++) {
		s1.add(s.charAt(i));
		}
		
		for(char a: s1) {
			System.out.print(a);
		}
		System.out.println();
		
	}
	
	public static void noOfAppearance(String s) {
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
	for(char c: s.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0)+1);
	}
		System.out.println(map);
	}

	public static void fizzBuzz(int i) {
		
		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(i%3==0) {
			System.out.println("Fizz");
		}
		else if(i%5==0) {
			System.out.println("Buzz");
		}
		else System.out.println(i);
		
	}
	
	public static void evenOdd(int i) {
		
		if(i%2==0) {
			System.out.println("even");
		}
		else System.out.println("odd");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Code 1: Two-string anagram. An anagram is when all the letters in one string exist in another
		//but the order of letters does not matter. Write a method that accepts two string arguments and returns true 
		//if they are anagram and false if they are not.
		
		anagram("mathu", "uhamt");
		anagram("mathu", "mathi");
		
		
	//Code 2: Remove duplicates from a string. Write a method that accepts one string argument and returns it without duplicates. 
		//We will see two versions of this method.
		
		removeDuplicates("mathumathi");
		
		
	//Code 3: Count letters(Map). Write a method that accepts a string as an argument. 
	//The method counts the number of appearances of each char and returns a map. 
		//The key will be a letter and the value will be the number of appearances in the string. See the input and output in the example.
		
		noOfAppearance("mathumathi");
		
	//Code 4: FizzBuzz. Print numbers from 1 to 100
		//If a number is divisible by 3 print Fizz
		//If a number is divisible by 5 print Buzz
		//If a number is divisible by both 3 and 5 print FizzBuzz
		
		fizzBuzz(9);
		fizzBuzz(125);
		fizzBuzz(15);
		fizzBuzz(8);
		
		
	//Code 5: . Even or Odd. Write a method that will accept one int as an argument. 
	//The method prints Even if the number is even and Odd if the number is odd.
		
		evenOdd(4);
		evenOdd(9);
		
	}

}
