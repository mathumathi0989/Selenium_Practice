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
