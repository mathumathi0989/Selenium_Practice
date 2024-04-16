package CodingProbApril;

import java.util.Scanner;

public class Apr15 {

	
	public static void charOccurance(String s) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		char c = sc.next().charAt(0);
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
			
		}
		System.out.println(c + ":" + count);
		
	}
	
	public static void isPalindrome(String s) {
	String s1 = "";
		for(int i= s.length()-1; i>=0; i--) {
			s1 = s1 + s.charAt(i);
		
		}
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("given " +s + " is palindrome");
		}
		else {
			System.out.println("given " +s + " is not a palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//charOccurance("abccdefgaa");
		isPalindrome("madam");
		isPalindrome("apple");
		
		/*
How do you count the occurrence of a given character in a string? 
How do you check if a given string is a palindrome? (solution)

How do you print the first non-repeated character from a string? (solution)
How do you convert a given String into int like the atoi()? (solution)
How do you reverse words in a given sentence without using any library method? (solution)
How do you check if two strings are a rotation of each other? (solution)
How do you find the length of the longest substring without repeating characters? (solution)
Given string str, How do you find the longest palindromic substring in str? (solution)
How to convert a byte array to String? (solution)
how to remove the duplicate character from String? (solution)
How to find the maximum occurring character in given String? (solution)
How do you remove a given character from String? (solution)
		 */
	}

}
