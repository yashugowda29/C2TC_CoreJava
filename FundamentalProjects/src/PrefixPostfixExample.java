
public class PrefixPostfixExample {

	public static void main(String[] args) {
		
		int numA=5;
		int numB=10;
		int numC=0;
		
		int numD = --numC + numB--; // -1 + 10 = 9
		System.out.println(numC); // -1
		System.out.println(numB); //9
		
		int numE = ++numB + numA++; // 10 + 5 = 16
		System.out.println(numB); //10
		System.out.println(numA); //6
		System.out.println(numE); //15
	}

}
