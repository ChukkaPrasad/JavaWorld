package basicPrograms;
import java.util.Scanner;
public class PrimeNumber {

	public static boolean isPrime(int num) {
		
		if(num==1||num==0) {	// 0,1 are not a prime numbers
			
			return false;//false condition
		}
		
		for(int i=2;i<Math.sqrt(num);i++) {
			
			if(num%i==0) {//false condition
				
				return false;
			}		
		}
		return true;//all conditions are false so prime returns else not prime
	
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number to check prime:");
		
		int n=sc.nextInt();// for checking long number make sure you have changed the integer to long
		sc.close();
		if(isPrime(n)) {
			
			System.out.println("This is a Prime Number");
			
		}else {
			
			System.out.println("This is not a Prime Number");
		}
		
		
	}

}
