package basicPrograms;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int factorial=1;//we need to initialize 1 in the starting
		
		System.out.println("Enter the Number");
		
		int factorialNum=sc.nextInt();//taking input
		
		sc.close();//closing resource
		
		int i;//just declaring variable i from out of the loop
		
		for(i=1;i<=factorialNum;i++) {
			
			factorial=factorial*i;// multiplying values form 1 to n
		}
		
		System.out.println("The Factorial of "+factorialNum+" is : "+factorial);
	}

}
