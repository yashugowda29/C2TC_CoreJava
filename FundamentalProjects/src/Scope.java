
public class Scope {

	public static void main(String[] args) {
		 
		int outer = 1;
		{
			int inner = 2;
			System.out.println(outer); // 1
			System.out.println(inner); // 2
		}
		int inner = 3;
		System.out.println(inner); // 3
		System.out.println(outer); // 1
	}

}
