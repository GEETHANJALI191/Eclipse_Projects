public class Candies {

	public static void main(String[] args) {
		int m=(int)getCandies(10,3);
		System.out.println(m);
	}
	
public static long getCandies(long n, long p)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		int[] fact=new int[count];
		for(int j=1,k=0;j<=n && k<count;j++)
		{
			if(n%j==0)
			{
				fact[k]=j;
				k++;
			}
			}
		
		if(p<=count)
			return fact[(int)p-1];
		else
			return 0;
		
	
	}
	}


