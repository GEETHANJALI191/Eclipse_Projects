
public class Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=Xor.maximum_XOR(10,15);
		System.out.println(m);
		

	}
	public static int maximum_XOR(int a, int b)
	{
		int max=0;
		for(int i=10;i<=15;i++)
		{
			for(int j=10;j<=15;j++)
			{
				int n=i^j;
				if(n>max)
				{
					max=n;
					
				}
			}
		}
		return max;
	}

}
