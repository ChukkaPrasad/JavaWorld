package basicPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		
		String original="MADAM";
		String reverse="";//should be at least empty string for future work
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--) {
			//reverse numbers printed up to length is zero
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse)) //checking strings
			System.out.println("This is a Palindrome string");
		else 
			System.out.println("This is not a Palindrome String");
		
	}

}
