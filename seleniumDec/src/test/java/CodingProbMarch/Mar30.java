package CodingProbMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mar30 {

	
	public static void reverse(String word) {
		String result = "";
		for(int i=word.length()-1; i>=0; i--) {
			result = result + word.charAt(i);
		}
		System.out.println(result);
	}
	
	
	public static void reverseArray(String[] arr) {
		
		List result = new ArrayList<>(Arrays.asList(arr));
		System.out.println(result);
		Collections.reverse(result);
		System.out.println(result);
	}
	
	public static void reverseWords(String sent) {
		
		String[] al = sent.split(" ");
		String result = "";
		
		for(int i=al.length-1; i>=0; i--) {
			
			result = result + al[i] + " ";
			
		}
		System.out.println(result);
		
	}
	
public static void isPrime(int num) {
	boolean prime = true;
	for(int i=2; i<=num/2; i++) {
		
		if(num%i==0) {
			prime = false;
			break;
				}
		}
	
	if(prime==true) {
		System.out.println(num + " is a prime number");
		
	}
	else System.out.println(num + " is not a prime number");	
}

public static void primeList(int count) {
int found = 0;
int num = 2;
while(found<count) {
	boolean isprim = true;
	for(int i=2; i<=num/2; i++) {
			if(num%i ==0) {
				isprim = false;
				break;
			}
		}
		
		if(isprim) {
			System.out.print(num);
			System.out.print(" ");
			found++;
		}
		num++;
		
	}
	
}
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1 - String reverse. Write a method that will take one string as an argument 
		//and return the reverse version of this string.
		
		reverse("mathu");
		
//2 - Array reverse. Write a method that will take an array as an argument 
		//and reverse it.
		String[] arr = {"mathu", "thanya", "gurdev", "dheena"};
		reverseArray(arr);
//3 - Reverse words. Write a method that will take a string as an argument. 
		//The method will reverse the position of words and return it.		
		reverseWords("My name is Mathumathi");

//4 - Prime number. A prime number is a number that can only be divided by itself and 1 without remainder.
	isPrime(7);
	isPrime(41);
	isPrime(60);

		primeList(100);
	}

}
