package CodingProbApril;

public class Apr12 {

	
	public static void digit(String s) {
		boolean result = false;
		for(int i=0; i<s.length(); i++) {
		if(Character.isDigit(s.charAt(i))) {
			result = true;
		}
		}
		if(result) {
			System.out.println(s + " contains digits");
		}
		else 
			System.out.println(s + " does not contains digits");
	}
	
	public static void vowelsConsonants(String s) {
		int vCount = 0;
		int cCount = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
		if((c == 'a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U')) {
			vCount = vCount + 1;
			
		}
		else {
			cCount = cCount + 1;
		}
		}
		
		System.out.println("Number of vowels are: "+vCount);
		System.out.println("Number of consonants are: "+cCount);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
How do you check if a string contains only digits? (solution)
How do you count a number of vowels and consonants in a given string? (solution)

How do you count the occurrence of a given character in a string? (solution)
How do you print the first non-repeated character from a string? (solution)
How do you convert a given String into int like the atoi()? (solution)
How do you reverse words in a given sentence without using any library method? (solution)
How do you check if two strings are a rotation of each other? (solution)
How do you check if a given string is a palindrome? (solution)
How do you find the length of the longest substring without repeating characters? (solution)
Given string str, How do you find the longest palindromic substring in str? (solution)
How to convert a byte array to String? (solution)
how to remove the duplicate character from String? (solution)
How to find the maximum occurring character in given String? (solution)
How do you remove a given character from String? (solution)

 */
		
		digit("mathu");
		digit("sd2b34wr");
		digit("12323");
		vowelsConsonants("bcgrta");
		vowelsConsonants("aeUgsfW");
		vowelsConsonants("AEiOubng");
	}

}
