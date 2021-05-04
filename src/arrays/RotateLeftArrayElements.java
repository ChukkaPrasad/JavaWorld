package arrays;

public class RotateLeftArrayElements {

	public static void main(String[] args) {  
        
        int [] arr = new int [] {1, 2, 3, 4, 5}; //first array
        
        System.out.println("Original array: ");  
        
        for (int i = 0; i < arr.length; i++) {  //before shift
            System.out.print(arr[i] + " ");  
        }
        
        int n = 3;  //no of rotations
        for(int i = 0; i < n; i++){ 
            int j, first; 
            first = arr[0];  //collecting first element from the array
            
            for(j = 0; j < arr.length-1; j++){  //shifting
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  //adding first element in the last index
        }  
        
        System.out.println("\nArray after left rotations: ");  
        for(int i = 0; i< arr.length; i++){  //after shift
            System.out.print(arr[i] + " ");  
        }  
    }  
}
