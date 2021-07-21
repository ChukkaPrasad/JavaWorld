package arrays;

public class LargestContiguosSumofSubArray {

	public static void main(String[] args) {

		int []arr= {-3,-2,4,-1,-2,1,5,-3};
		int n=arr.length;
		int sum=largesumofsubarray(arr,n);
		System.out.println("The Largest Sum of Contiguos SubArray is: "+sum);
	}
	public static int largesumofsubarray(int[] arr,int n) {
		int largesum=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			if(sum<0) {
				sum=0;
			}
			if(sum>largesum) {
				largesum=sum;
			}
		}
		return largesum;
	}

}
