package arrays;//DUPLICATE MONKEY IN A GROUP
public class DuplicateNumInArray {
	public static void main(String[] args) {
		int[] arr= {2,3,1,4,2,6};	
		int temp=0;
		
		for(int i=0; i<arr.length; i++)  //sorting all the elements 
        {  
            for(int j=i+1; j<arr.length; j++)  
            {  
                if(arr[i] > arr[j])  //compare the all the elements and swap the min element to the first element.
                {  
                    temp = arr[i];  
                    arr[i] = arr[j]; //swapping element to the first
                    arr[j] = temp;  
                }  	// 	finding the duplicate monkey in the monkey group of n=6 monkeys
                	// 	chukka and prasad are comparing the all the monkeys
                	// 	chukka is standing at the stating and prasad is passing/traversing remaining monkeys and checking each monkey with chukka's monkey value
            }  		// 	and replace the monkeys as min value comes first and more than that comes next with respect to monkey value
            		//	all monkeys are sorted or orderd or formed a line according the value
            		//	Ex:- short monkeys comes first and remaining next to each other
            		//	monkey m: m1 m2 m2* m3 m4 m6
            		//	the same  monkeys found or same value monkey find and 2nd monkey of the same value is the duplicate monkey
        }			//	finally found the duplicate monkey m2
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1])
				System.out.println(arr[i+1]);
		}
	}
}
