package CodingProbApril;

public class Apr23 {

	public static void isPrime(int n) {
		boolean result = true;
	for(int i=2; i<n;i++) {
			if(n%i==0) {
				result = false;	
			}
		
		}
	if(result) {
		System.out.println(n + " is a prime number");
	}
	else {
			System.out.println(n + " is not a prime");
	}
}
	
	
	public static void main(String[] args) {
		isPrime(3);
		isPrime(4);
		isPrime(11);
		isPrime(20);
		// TODO Auto-generated method stub
/*
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
