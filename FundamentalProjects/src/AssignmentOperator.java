
public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		a+=5; // a=a+5; // 6
		b*=4; // b=b*4; // 8
		c+=a*b; // c=c+a*b; // 3+(6*8)=51
		c%=6; // c=c%6; // 51%6=3
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a + b + c); // 8+6=14 +c=14+3=17
		System.out.println(a + " " + b + " " + c); // 6 +b = 6 8 +" " = 6 8 +c = 6 8 3

	}

}
