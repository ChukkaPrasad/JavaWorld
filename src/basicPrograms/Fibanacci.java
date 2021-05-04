package basicPrograms;

public class Fibanacci {

	public static void main(String[] args) {
		
		int firstElement=0,secondElement=1,nextElement,totalCount=10;
		
		System.out.print(firstElement+" "+secondElement);//printing base two elements
		
		for(int checker=0;checker<totalCount-2;checker++) {// just need to print remaining 8 elements
			
			nextElement=firstElement+secondElement;//updating the values each time 
			
			firstElement=secondElement;
			
			secondElement=nextElement;
			
			System.out.print(" "+nextElement);//printing the next element		

		/* int n0=0,n1=1,n2,n=10;
		System.out.print(n0+" "+n1);
		for(int i=0;i<n-2;i++) {        //same thing represents with different variable names
			n2=n0+n1;
			n0=n1;
			n1=n2;
			System.out.print(n2);*/
		
		}
	
	}

}
