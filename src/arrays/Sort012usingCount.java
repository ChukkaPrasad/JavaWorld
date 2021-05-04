package arrays;

public class Sort012usingCount {

	public static void main(String[] args) {

		int a[]= {0,1,0,2,0,1,2,1,0};//array
		int zerocount=0;//counting 0,1,2 and assigning 0,1,2 in the count positions
		int onecount=0;
		int twocount=0;
		int l=a.length;
		for(int i=0;i<l;i++) {//counting
			if(a[i]==0)//if zero
				zerocount++;
			else if(a[i]==1)//if one occur
				onecount++;
			else if(a[i]==2)//if two occur
				twocount++;
			else System.out.println(" ");
		}
		System.out.println("the total zero type monkeys:"+zerocount);//counting all types of monkeys 
		System.out.println("the total one type monkeys:"+onecount);//adding monkeys to cages based on number of monkeys and cages
		System.out.println("the total two type monkeys:"+twocount);//adding monkeys directly
		
		for(int j=0;j<zerocount;j++) {//assigning the 0's up to zero count in the array
			a[j]=0;//all zeros up to count
		}
		for(int j=zerocount;j<(zerocount+onecount);j++) {//assigning 1's to remaining one count array
			a[j]=1;//assigning 1 to the middle
		}
		for(int j=onecount+zerocount;j<l;j++) {
			a[j]=2;//assigning the 2's in the end using count
		}
		
		for(int i:a) {//adding other zero type monkeys into cages instead of original zero type monkeys
			System.out.print(i);//display sorted array of the 0, 1 and 2
		}
	}

}
