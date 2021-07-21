package arrays;
public class RepeatandMissing {
	public static void main(String[] args) {
		int arr[]= {2,3,1,2,4,5};//ARRAY OF 1,2,3....N
		System.out.print("The Repeating Element/Monkey:	");
		repeatElement(arr);//repeated element
		System.out.print("The Missing Element/Monkey:	");
		missingElement(arr);//missing element
	}
	public static void repeatElement(int[] arr) {
		int size=arr.length; 
		for(int i=0;i<size;i++) {//making the unvisited as positive 
			int absval=Math.abs(arr[i]);//making values to positive values
			if(arr[absval-1]>0) {//if that is true//absval-1 is for checking the 0th position also
				arr[absval-1]=-arr[absval-1];//make it is negitive value
			}else
				System.out.println(absval);//printing the element which is not negitive
		}
	}
	public static void missingElement(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(arr[i]>0) {//checking the element is not a negitive 
				System.out.println(i+1);
			}
		}
	}

}
