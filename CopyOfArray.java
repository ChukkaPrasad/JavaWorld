package arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		
		
		int arr[]=new int[] {1,2,3,6,5,4};//array one
		int arr2[]=new int [arr.length];//array two with same length of array one
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];//copying arrays
		}
		
		System.out.println("THE ARRAY OF FIRST:");//prints array one
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nTHE ARRAY OF SECOND:");//prints array two
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
