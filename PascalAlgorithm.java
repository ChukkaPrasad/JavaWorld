package arrays;
//import java.lang.Math;

public class PascalAlgorithm {

	public static void main(String[] args) {

		int n=10;
		pascalpattern(n);
	}
	public static void pascalpattern(int n) {
		/*for(int i=1;i<=n;i++) {
			System.out.println(Math.pow(11,i));
		}*/
		for(int i=1;i<=n;i++) {
			int p=1;//using one at starting
			for(int j=1;j<=i;j++) {
				System.out.print(p+"	");
				p=(p*(i-j))/j;//pascal formula
			}System.out.println();
		}
	}

}
