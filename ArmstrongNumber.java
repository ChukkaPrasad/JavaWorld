package basicPrograms;

public class ArmstrongNumber{

	public static void main(String[] args) {
		
		//a positive number is called Armstrong number if it equal to the sum of the cubes of its digits.
		int originalNum=153;//actual number
		
		int checking =0;//using for checking
		
		int temp,reminder;//reminder for cut off the number
		
		//temporary variable for storing value
		temp=originalNum;
		
		while(originalNum>0) {
			
			reminder=originalNum%10;//getting reminder
			
			originalNum=originalNum/10;//divide the number
			//Armstrong number 1= 1^3 + 5=5^3 + 3=3^3
			checking=checking+(reminder*reminder*reminder);
		}
		
		if(temp==checking) //equals
			System.out.println("This is a Armstrong Number");
		else 
			System.out.println("This is not a Armstrong Number");
		
		System.out.println();
		
	}

}
