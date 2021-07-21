package basicPrograms;

public class FactorialRecursion {
	
	public static int factorial(int n) {
		
		if(n==0) // condition zero
			return 1;
		
		else //return factorial via decrementing order
			return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		//calling method
		System.out.println("the facorial is : "+factorial(10));
		
	}

}
