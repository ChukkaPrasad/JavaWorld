
package strings;

public class DividingMultupleStringParts {

	public static void main(String[] args) {
		
		String str="CHUKKA VARA PRASAD";//string
		int n=3;//no of the parts
		int subSetNum=str.length()/n;//length of substring for each parts
		
		String [] subsets=new String[n];//making array of the parts
		int position=0;//making starting position zero

		
		if(str.length()%n!=0) {//checking if factor can be divide able or not
			System.out.println("This String can not be divided Equally.");
		}
		else {
			System.out.println("This String can Be Divided Equally Parts and the Parts are:");
			
			for(int i=0;i<str.length();i=i+subSetNum) {//making array of 4  chars at each part
				
				subsets[position]=str.substring(i,i+subSetNum);//saving in the subsets array
				
				position++;//increment the array position
			}
			
			for(String i:subsets) {
				System.out.println(i);//prints subsets
			}
		}
		
		
	}

}
