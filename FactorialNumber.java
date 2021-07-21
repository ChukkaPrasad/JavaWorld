package basicPrograms;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		long factorial=1;//we need to initialize 1 in the starting
		
		System.out.println("Enter the Number");
		
		long factorialNum=sc.nextLong();//taking input
		
		sc.close();//closing resource
				
		for(int i=1;i<=factorialNum;i++) {
			
			factorial=factorial*i;// multiplying values form 1 to n
		}
		
		System.out.println("The Factorial of "+factorialNum+" is : "+factorial);
	}

}
