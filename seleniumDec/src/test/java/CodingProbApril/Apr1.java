package CodingProbApril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Apr1 {

	public static void isPalindromString(String str) {
		
		StringBuilder result = new StringBuilder(str);
		result.reverse();
		if(str.contentEquals(result)) {
			System.out.println(str + " - Yes, it is a palindrome");
		}
		else System.out.println(str + " - Not a palindrome");
	}
	
public static void isPalindromNum(int num) {
		
	String s = String.valueOf(num);
	String result = "";
	for(int i=s.length()-1; i>=0; i--) {
		result = result + s.charAt(i);
	}
	if(s.contentEquals(result)) {
		System.out.println(s + " - Yes, it is a palindrome");
	}
	else System.out.println(s + " - Not a palindrome");
	
	
}
	
public static void maxMinArray(int[] num) {
	int min = num[0];
	int max = num[0];
	for(int i=1; i<num.length; i++) {
	if(num[i]<min) {
		min = num[i];
	}
	if(num[i]>max) {
		max = num[i];
	}
	
	}
	System.out.println(min + " is a Mininum value in the array");
	System.out.println(max + " is a Maximium value in the array");
}

public static void secondMaxMinArray(int[] num1) {
	
	ArrayList<Integer> ar = new ArrayList<>();
	for (int num : num1) {
	    ar.add(num);
	}
	Collections.sort(ar);
System.out.println(ar);
System.out.println(ar.get(1) + " is second min value in the array");
System.out.println(ar.get(ar.size()-2) + " is second max value in the array");
}



public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
//Code 1: String palindrome. A palindrome is a word, phrase, number, or 
		//sequence of words that reads the same backward as forward.
		
		isPalindromString("madam");
		isPalindromString("mathu");

		
		
//Code 2: Number palindrome. A palindrome is a word, phrase, number, or 
	//sequence of words that reads the same backward as forward.		
		
		isPalindromNum(53627);
		isPalindromNum(45654);
		
	
//Code 3: Max/min number from an array. Write a method that will 
	//accept an array of int as an argument and it returns the max/min number from a given array.
		int[] num = {23,3,455,2,6,1453,3};
		maxMinArray(num);

		*/
//Code 4: Find the second min/max number from an array. 
	//Write a method that accepts an int array as an argument and 
	//returns a second or n min/max number from the given array.
		
		int[]num1 = {2,24,75,2638,1,78,92};
		secondMaxMinArray(num1);

//Code 5: Swap values of two variables without direct reassignment and 
	//without creating any extra variables.
		
		
		
		
		
		
		
	}

}
