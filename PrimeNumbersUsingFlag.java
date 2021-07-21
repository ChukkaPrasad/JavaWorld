package basicPrograms;
import java.util.Scanner;

public class PrimeNumbersUsingFlag {
	
	public static void main(String[] args) {
		
		int num,m=0,flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Check:");
		num=sc.nextInt();
		sc.close();
		
		m=num/2;// to check number up to half numbers
		
		if(num==0||num==1) {
			
			System.out.println("This is not a Prime Number");
			
		}
		else{	
			for(int i=2;i<m;i++) {//no need to check all numbers for finding prime
				
				if(num%i==0) {// number will repeat after half of numbers
					
					System.out.println("This is not a Prime Number");
					flag=1;
					break;
				}
			}
		if(flag==0) {
				System.out.println("This is a Prime Number");
			}
			
		}
	}
}
