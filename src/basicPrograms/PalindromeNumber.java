package basicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121,reverseNum=0,reminder;
		
		System.out.println("The actual number:"+num);
		
		int temp=num;//need to change the variable for the checking
		
		while(num>0) {
			
			reminder=num%10;//divided into reminder 121%10 = 1   `12%10 = 2   1%10 = 1
			
			reverseNum=(reverseNum*10)+reminder;//adding reminder to reverse num  1 2 1
			
			num=num/10;//dividing the num 121/10 = 12   12/10 = 2   1/10 = 0.1(no need)
		}
		
		System.out.println("The reverse Number:"+reverseNum);
		
		if(reverseNum==temp)
			System.out.println("This is a Palindrome Number");
		else 		
			System.out.println("This is not a Palindrome Number");
	}

}
