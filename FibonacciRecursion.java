package basicPrograms;

public class FibonacciRecursion {

	static int baseElement1=0,baseElement2=1,nextElement;
	
	 public static void fibonacci(int count) {
			
			if(count>0) {	//checks the condition and calls
				
				nextElement=baseElement1+baseElement2;
				
				baseElement1=baseElement2;// we can also sum all the element and prints the value
				
				baseElement2=nextElement;//for that,simply put sum=sum+nextElement and prints it by initializing global element
				
				System.out.print(" "+nextElement);
				
				fibonacci(count-1);	//recalls itself decrement order called recursion
	//we can use single term variables like n0,n1,n but describing variable makes meaningful
			}
			
		}
	public static void main(String[] args) {
		int n=10;
		System.out.print(baseElement1+" "+baseElement2);//first two prints
		fibonacci(n-2);//need remaining 8 from 10 so n-2
	}

}
