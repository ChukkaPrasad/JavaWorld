package strings;

public class VowelsConsonentsInString {

	public static void main(String[] args) {
		
		String str="Hello i am Chukka PRASAD .";
		
		str=str.toLowerCase();//converting all the elements to the smaller or upper case
		
		System.out.println("The String is : "+str);
		
		int vCount=0,cCount=0;//make count zero starting
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||
					(str.charAt(i)=='o')||(str.charAt(i)=='u'))
				vCount++;//checking via directly mentioning and increase count
			
			else 
			{
				if((str.charAt(i)>'a')&&(str.charAt(i)<='z'))
					cCount++;//checking in a range of alphabets		
			}
		}
		
		System.out.println("The Vowels are : "+vCount);
		System.out.println("The Consonent are : "+cCount);
	}

}
