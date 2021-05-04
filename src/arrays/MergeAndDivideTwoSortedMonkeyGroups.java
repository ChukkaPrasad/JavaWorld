package arrays;

public class MergeAndDivideTwoSortedMonkeyGroups {

	public static void main(String[] args) {
		int group1[]= {10,20,30,40,50};
		int group2[]= {15,25,35};
		int n=group1.length+group2.length;
		int allMonkey[]=new int[n];
		
		mergeMonkeyGroup(group1,group2,allMonkey);
		
		while(n/2>0) {
			if(n%2==0) {
				n=n/2;
				System.out.println("The Gap is:" +n);
			}else {
				n=(n/2)+1;
				System.out.println("The Gap is:" +n);
			}
			printSortedMonkeys(allMonkey,n);
		}
		
		System.out.println("The Sorted Monkey Groups are :");
		printTwoMonkeyGroups(allMonkey,group1,group2);
	}
	
    public static void mergeMonkeyGroup(int[] group1, int[] group2,int allMonkey[]) {
	    int pos=0;
		for(int i=0;i<group1.length;i++) {
			allMonkey[pos]=group1[i];
			pos++;
		}
		for(int j=0;j<group2.length;j++) {
			allMonkey[pos]=group2[j];
			pos++;
		}
	}
	public static void printTwoMonkeyGroups(int[] allMonkey,int [] group1,int [] group2) {
	    int pos=0;
		for(int i=0;i<group1.length;i++) {
			group1[i]=allMonkey[pos];
			pos++;
			System.out.print(" "+group1[i]);
		}
		System.out.println();
		for(int j=0;j<group2.length;j++) {
			group2[j]=allMonkey[pos];
			pos++;
			System.out.print(" "+group2[j]);
		}
	}
	
	public static void printSortedMonkeys(int[] allMonkey,int n) {
		 int temp=0;
		 for(int i=0;(i+n)<allMonkey.length;i++) {
			 if(allMonkey[i]>allMonkey[i+n]) {
				 temp=allMonkey[i];
				 allMonkey[i]=allMonkey[i+n];
				 allMonkey[i+n]=temp;
			 }
		 }
		 for(int i:allMonkey) {
			 System.out.print(" "+i);
		 }System.out.println();
	}
}
