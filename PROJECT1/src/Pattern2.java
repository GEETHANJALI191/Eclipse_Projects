
public class Pattern2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int f1=0,f2=1,f=0,n=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==0 && j==0)
				{
					System.out.print(f1);
				}	
				else	if(i==1 && j==0)
						{
							System.out.print(f2+" ");
						}
						else
						{
							f=f1+f2;
							System.out.print(f+" ");
							f1=f2;
							f2=f;
						}
			}
			System.out.println();
		}
		
		
	}
}
	


