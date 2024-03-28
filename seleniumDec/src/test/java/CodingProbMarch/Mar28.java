package CodingProbMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mar28 {

	
	public static void reverseNum(String num) {
		String s = "";
		for(int i= num.length()-1; i>=0; i--) {
			s = s + num.charAt(i);
			
		}
		System.out.println(s);
		
	}
	
	public static void isPrime() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check prime or not: ");
		int num = sc.nextInt();
	
		
		if(num<=1) {
			System.out.println("prime");
		}
		else if(num % 2==0) {
			System.out.println("its not a prime");
		}
		else System.out.println("It is a prime");
		
		
	}
	
	public static void maxValues(int intArr[]) {
		 List<Integer> ar = new ArrayList<>(intArr.length);
		 for(int num : intArr) {
			 ar.add(num);
		 }
		System.out.println("Before sorting " +ar);
		
		Collections.sort(ar, Collections.reverseOrder());
	
		System.out.println("After sorting " +ar);
	
		for(int i=0; i<2; i++) {
			System.out.println(ar.get(i));
			
		}
	
		
	}
	public static void main(String[] args) {

		/*
//Code 3: 3: Write a function to reverse a number in Java.
		
reverseNum("54321");
reverseNum("");
 reverseNum("madam");
 reverseNum("uhtam");
 
		
//Code 4: 4: Write a method to check prime no. in Java.	
		
		isPrime();
		
	
//Code 5: 5: Write a Java program to find out the first two max values from an array.
		
		int intArr[] = {2,3,1,23,4,123,234,6,4};
		maxValues(intArr);
		
			*/
		
	}

}
