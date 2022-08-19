
public class ContinueExample {

	public static void main(String[] args) {
		
		int lim=10;
		int sum=0;
		
		for(int i=1;i<=lim;i++)
		{
			if(i%4==0) //1%4==1 //2%4=2 //3%4=4 //4%4=0 //5%4=1
				       //6%4=1 //7%4=1 //8%4=2 //9%4=2 //10%4=2
			{
				continue;
			}
			sum+=i; // sum=sum+i = 0+1=1 // 1+2=3 // 3+3=6 // 6+5=11
			        // 11+6=17 // 17+7=24 // 24+9=33 // 33+10=43
		}
		System.out.println(sum);

	}

}
