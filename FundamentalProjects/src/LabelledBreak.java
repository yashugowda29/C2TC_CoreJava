
public class LabelledBreak {

	public static void main(String[] args) {
		
		int len=3;
		int key=1;
		int k=0;
		
		out:
		{
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==key)
				{
					break out;
				}
				k+=1; // k=k+1 = 0+1=1 //1+1=2 //2+1=3
			}
		}
		}
		System.out.println(k);

	}

}
