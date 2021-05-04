package arrays;
public class Sort012
{
	public static void main(String[] args)
	{
		int arr[]= {0,1,2,1,0,1,2,1,0,1,0,0};
		sort012(arr);// Dutch men national flag algorithm
		System.out.print("The Three Monkey groups are:");
		printsort(arr);	
	}
	 static void printsort(int[] arr) //sort o,1,2 means sorting monkeys into three groups as group 0,1,2
	 {									//for that we need chukka,vara,prasad to sort the three group monkeys
		 for(int i:arr) {				//chukka takes  monkey 0 , vara takes monkey 1,prasd takes monkey 2
			 							//vara traverse the entire group of monkeys if the monkey finds as monkey 0 then vara swap the monkeys with the chukka and chukka fill the position and try to move one step forward
			 							//if vara finds monkey 1 then he no need to swap, just move on to next monkey
			 							//if vara finds monkey 2 then he swaps monkey with prasad ,after that prasad fill that position and comes down to the next position/cage
			 							//after filling all the monkeys in the cage or array ,our problem is done.
			 System.out.print(i);
		 }
	}
	 static void sort012(int[] arr) 
	 {
		 int length=arr.length;
		 int temp,low_chukka=0,mid_vara=0,high_prasad=length-1;
		 while(mid_vara<=high_prasad) //0<length=9
		 {
			 switch(arr[mid_vara]) //comparing array values in terms of switch cases
			 {
			 case 0:
			 {
				 temp=arr[low_chukka];
				 arr[low_chukka]=arr[mid_vara];//swapping array elements to the down or low_chukka if element is zero
				 arr[mid_vara]=temp;
				 low_chukka++;
				 mid_vara++;
				 break;
			 }
			 case 1:
			 {
				 mid_vara++;//no need to swap element if the element is 1 in the mid_varadle element and update the position
				 break;
			 }
			 case 2:
			 {
				 temp=arr[mid_vara];
				 arr[mid_vara]=arr[high_prasad];//swapping the 2 value elements to high_prasad or end of the array
				 arr[high_prasad]=temp;
				 high_prasad--;
				 break;
			 }
			 
			 }
		 }
	}

}

/*input using for loop
Scanner sc=new Scanner(System.in);
System.out.println("enter the length and the values");
int length=sc.nextInt();
for(int i=0;i<length;i++){
 	arr[i]=sc.nextInt();
}//we cant use iterator for arrays [only for array list and linked list or others
for(int i:arr) {
	  System.out.print(i);
}
sc.close();
*/