package strings;

import java.util.Arrays;

public class StringAnagramSameString {

	public static void main(String[] args) {
		
		String one="Hello iam prasad";//strings should contain same characters
		String two="Dasarp mai olleh";//characters can place irrespective of order
		
		if(one.length()!=two.length()) {//checking length first
			System.out.println("THIS IS NOT A  ANAGRAM.");
		}
		else {
			
			one=one.toUpperCase();//we can change them into lower or upper case
			two=two.toUpperCase();//to maintain check in a good way 
			
			char string1[]=one.toCharArray();//making array of strings
			char string2[]=two.toCharArray();
			
			Arrays.sort(string1);//already existing collections for sorting bubble sort
			Arrays.sort(string2);//sorting
			
			if(Arrays.equals(string1,string2)==true) {
				System.out.println("THIS IS A ANAGRAM.");
			}
			
		}
		
	}

}
