package CodingProbApril;

public class Apr3 {

	public static void bruteForce(int[] num, int n) {
		int sum = 0;
		
		for(int i=0; i<num.length-1; i++) {
			
			sum = num[i]+ num[i+1];
			if(sum==n) {
				System.out.println("pair found. Those are " +num[i] + " and " + num[i+1]);
			}
			
		}
		
	}
	
	public static void fibonacci(int n) {
		
		int n1 = 0;
		System.out.print(n1 + " ");
		int n2 = 1;
		System.out.print(n2 + " ");
		
		for(int i=1; i<n-1; i++) {
			
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}
	
		System.out.println();
	}
	
	public static void sortWithoutInbuilt(String[] arr) {
	
	
	}
	
	
	public static void main(String[] args) {
		
//Code 1: Sum of two. Write a method that accepts an int[] array and an int number, and find 2 elements in the array that sum is equal to the given int. Assume that an input array will have only one pair of numbers that sum equal to our given number. It will always have this pair. See input and output examples. I use the Brute Force algorithm.
		
		int[] num = {2, 7, 11, 15};
		bruteForce(num, 18);
		
		
//Code 2: The Fibonacci. It is a series of numbers where the next number is the sum of the previous two numbers. The first two numbers of the Fibonacci is 0 followed by 1. Write a method that will accept one int number n. The method will print n number of Fibonacci numbers.

		fibonacci(7);
		
//Code 3: 19. Balanced String. This question has become very popular lately. The program should find out if an input string is balanced or not.
		/*
		 System.out.println(isBalanced("[{()}]")); // true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}")); // false
        System.out.println(isBalanced("({}{}([{}]))")); // true
        System.out.println(isBalanced("({")); // false
        
		 */
		
		
//Code 4: Sort array without built-in sort methods. In this example, we will use selection sort and bubble sort algorithms to sort our array.
	
		String[] arr = {"mathu", "dheena","thanya", "gurdev"};
		sortWithoutInbuilt(arr);
		
	}

}
