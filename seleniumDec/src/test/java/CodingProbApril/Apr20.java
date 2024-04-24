package CodingProbApril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Apr20 {

	
	public static String string1(String s) {
		String result = "";
		for(int i=s.length()-1; i>=0; i--) {
			result = result + s.charAt(i);
		}
		System.out.println(result);
		return result;
	}
	
	public static int string2_1(int[] num) {
		
		int result = 0;
		List l = new ArrayList<>();
		
		for(int i = 0; i<num.length; i++) {
			l.add(num[i]);
		}
		Collections.sort(l);
		Collections.reverse(l);
		
		System.out.println(l.get(0));
		return result;
		
	}
	
	public static String string2_2(String[] s) {
		
		String result = null;
		List l = new ArrayList<>();
		
		for(int i=0; i<s.length;i++) {
			l.add(s[i]);
		}
		Collections.sort(l);
		Collections.reverse(l);
		
		System.out.println(l.get(0));
		return result;
		
	}
	
	public static boolean string3(String s1, String s2) {
		String s3 = "";
	for(int i=s1.length()-1; i>=0; i--) {
		s3 = s3 + s1.charAt(i);
	}
		System.out.println(s3);
		System.out.println(s2);
		if(s3.equalsIgnoreCase(s2)) {
			System.out.println("given strings " +s1 +" and "+ s2 + " are palindrome");
			return true;
		}
		else System.out.println("given strings " +s1 +" and "+ s2 + " are not palindrome");
		
		return false;
		
	}
	
	public static int string4(int n) {
		
		//4! = 4*3*2*1
		int result =1;
		for(int i=n; i>0; i--) {
			result = result *n;
		n = n -1;
		}
		System.out.println(result);
		return result;
		
	}
	
	
	public static int string5(int n) {
		int result = 0;
		//0,1,1,2,3,5,8,13,21
		
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1);
		System.out.print(" ");
		System.out.print(n2);
		System.out.print(" ");
		for(int i=2; i<n; i++) {
			result = n1 + n2; //1
			System.out.print(result);
			System.out.print(" ");
			n1 = n2;
			n2 = result;
		}
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		string1("mathu");
		int[] num = {23,3,454,90,8,3456,75};
		string2_1(num);
		String[] s = {"a","ant","mathu","zebra","thanya","gurdev","dheena"};
		string2_2(s);
		string3("mathu", "uhtam");
		string3("mom", "amma");
		string3("god", "dog");
			string4(5);
		*/
		
	
		string5(10);
/*
1. Reverse a String:
  Write a Java program to reverse a given string.
2. Find the Largest Element in an Array:
  Find and print the largest element in an array.
3. Check for Palindrome:
  Determine if a given string is a palindrome (reads the same backward as forward).
4. Factorial Calculation:
  Write a function to calculate the factorial of a number.
5. Fibonacci Series:
  Generate the first n numbers in the Fibonacci sequence.
6. Check for Prime Number:
  Write a program to check if a given number is prime.
7. String Anagrams:
  Determine if two strings are anagrams of each other.

8. Array Sorting:
  Implement sorting algorithms like bubble sort, merge sort, or quicksort.

9. Binary Search:
  Implement a binary search algorithm to find an element in a sorted array.

10. Duplicate Elements in an Array:
  Find and print duplicate elements in an array.

11. Linked List Reversal:
  Reverse a singly-linked list.

12. Matrix Operations:
  Perform matrix operations like addition, multiplication, or transpose.

13. Implement a Stack:
  Create a stack data structure and implement basic operations (push, pop).

14. Implement a Queue:
  Create a queue data structure and implement basic operations (enqueue, dequeue).

15. Inheritance and Polymorphism:
  Implement a class hierarchy with inheritance and demonstrate polymorphism.

16. Exception Handling:
  Write code that demonstrates the use of try-catch blocks to handle exceptions.
17. File I/O:
  Read from and write to a file using Java's file I/O capabilities.
18. Multithreading:
  Create a simple multithreaded program and demonstrate thread synchronization.
19. Lambda Expressions:
  Use lambda expressions to implement functional interfaces.
20. Recursive Algorithms:
  Solve a problem using recursion, such as computing the factorial or Fibonacci sequence.


 */
	}

}
