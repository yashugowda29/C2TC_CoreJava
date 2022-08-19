
public class RightShiftOperator {

	public static void main(String[] args) {
		
		int i;
		int num=16;
		
		for(i=0;i<4;i++)
		{
			num=num>>1; // 16>>1 -> 64 32 16 8 4 2 1
		                        //  0  0  1  0 0 0 0
		                        //  0  0  0  1 0 0 0
		System.out.println(num);   //  8  4  2  1
		}

	}

}
