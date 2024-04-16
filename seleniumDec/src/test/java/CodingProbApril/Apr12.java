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



 */
		
		digit("mathu");
		digit("sd2b34wr");
		digit("12323");
		vowelsConsonants("bcgrta");
		vowelsConsonants("aeUgsfW");
		vowelsConsonants("AEiOubng");
	}

}
