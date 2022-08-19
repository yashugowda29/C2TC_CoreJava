import java.util.Random;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		
		Random rand = new Random(); // Object Creation
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i:" + i); // 21
		System.out.println("j:" + j); //68
		System.out.println(i>j); // F
		System.out.println(i<j); // T
		System.out.println(i>=j); // F
		System.out.println(i<=j); // T
		System.out.println(i==j); // F
		System.out.println(i!=j); // T
		
		System.out.println((i<10) && (j<10)); // T && F = F
		System.out.println((i<10) || (j<10)); // T || F = T
	}

}
