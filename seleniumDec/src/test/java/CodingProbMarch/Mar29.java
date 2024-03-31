package CodingProbMarch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mar29 {

	
	public static void largestPrimeNo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		List ar = new ArrayList<>();
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
		if(i%j==0) {
		
			isPrime = false;
			break;
		}
			}
			if(isPrime) {
			ar.add(i);
			
			}
		}
		
		Collections.reverse(ar);
		System.out.println(	ar.get(0));	
		
	}
	
	
	
	
	
	public static void isPrimeNo(int num) {
		
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Code to print the largest prime number in Java as per the below rules.
		//a) Make sure the prime number is less than or equal to a given number.
		//b) Ask for user input
		
		largestPrimeNo();
		
		isPrimeNo(100);
	}

}
