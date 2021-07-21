package arrays;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {
		
		int arr[]=new int [] {1,2,4,2,5,1,2,5,5};//original array
		
		int frequency[]=new int[arr.length];//same length array for frequency array because
											//worst case of each element occur once happen
		int visited=-1;//separate the visited numbers as -1
		
		for(int i=0;i<arr.length;i++) {//checking from first element
			
			int count=1;//make count
			
			for(int j=i+1;j<arr.length;j++) {//checking from second element
				
				if(arr[i]==arr[j]) {//comparing both elements
//closing/ neglate inner loop elements using visited					
					count++;//if true, element occur count increases
					frequency[j]=visited;//make visited occurs separate
				}
			}
//saving occurs in outer loop			
			if(frequency[i]!=visited) {//if some of the elements not visited
				frequency[i]=count;//makes go throw all of these, save all these in the frequency array
			}
		}
		
		for(int i=0;i<frequency.length;i++) {//printing arrays
			
			if(frequency[i]!=visited) {//remove visited group and display with count
				
				System.out.println(arr[i]+"|"+frequency[i]);//just display counts
			}
		}
	}

}
