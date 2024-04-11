package CodingProbApril;

import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Apr9 {

	
	public static void ArrayToString(String... arr) {
		
		String s = "";
		for(int i=0; i<arr.length; i++) {
			
			s = s + arr[i];
			
		}
		System.out.println(s);
		
		String s1 = String.join(";", arr);
		System.out.println(s1);
		
	}
	
	public static void valueOfX() {
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
	}
	
	public static void capitalize(String str) {
	String s = "";
	String[] arr = str.split(" ");
		//List<String> arr = Arrays.asList(str.split(" "));
		for(int i=0; i<arr.length; i++) {
			String s1 = arr[i];
			s = s + s1.substring(0,1).toUpperCase() + s1.substring(1, s1.length());		 
		}
		
		System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Code 1: String array to String		
		
		String[] arr = {"t", "r", "v"};
		
		ArrayToString(arr);
		/*
//Code 2: Value of X
		valueOfX();

//Code 3: Capitalize 
		
		capitalize("my name is mathumathi");
		capitalize("naveen automation labs");
		capitalize("n");
		capitalize("n n n n");
		capitalize("123 test mathu");
		capitalize("n n ");
		*/
	}

}
