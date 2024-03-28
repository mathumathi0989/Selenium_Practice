package CodingProbMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Mar27 {

	
	
	public static void code1(String arr[]) {
		
		HashSet< String> hset = new HashSet<>();
	
		for(String s: arr) {
			hset.add(s);
		}
		System.out.println(hset);
	
	}
	
	public static void code2(String arr1[]) {
		
		ArrayList ar = new ArrayList<>(Arrays.asList(arr1));
		
	System.out.println("Before sorting: "+ ar);
	Collections.sort(ar);

	System.out.println("After sorting: "+ar.toString());
	}
	
	public static void main(String[] args) {
	
	//Code 1: Write code to filter duplicate elements from an array and print as a list.
		
		
		String arr[] = {"cat", "dog", "cat", "mouse", "dog"};
		code1(arr);
		
		
	//Code 2: Write code to sort the list of strings using Java collection
		String arr1[] = {"banana", "apple", "worm", "watermelon", "cherry"};
		code2(arr1);
		
	}

}
