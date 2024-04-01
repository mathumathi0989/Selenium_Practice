package CodingProbApril;

public class Apr1 {

	public static void isPalindromString(String str) {
		
		StringBuilder result = new StringBuilder(str);
		result.reverse();
		if(str.contentEquals(result)) {
			System.out.println(str + " - Yes, it is a palindrome");
		}
		else System.out.println(str + " - Not a palindrome");
	}
	
public static void isPalindromNum(int num) {
		
	String s = String.valueOf(num);
	String result = "";
	for(int i=s.length()-1; i>=0; i--) {
		result = result + s.charAt(i);
	}
	if(s.contentEquals(result)) {
		System.out.println(s + " - Yes, it is a palindrome");
	}
	else System.out.println(s + " - Not a palindrome");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Code 1: String palindrome. A palindrome is a word, phrase, number, or 
		//sequence of words that reads the same backward as forward.
		
		isPalindromString("madam");
		isPalindromString("mathu");

		
		
//Code 2: Number palindrome. A palindrome is a word, phrase, number, or 
	//sequence of words that reads the same backward as forward.		
		
		isPalindromNum(53627);
		isPalindromNum(45654);
		
		
		
		
		
		
		
		
		
	}

}
