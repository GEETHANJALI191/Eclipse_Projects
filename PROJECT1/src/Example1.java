
public class Example1 {

	public static void main(String[] args)
	{
		int x=100,n1=0,n2=0,n3=0,temp=0;
		int[] num=new int[100];
		for(int i=0;i<num.length;i++){

			num[i]=x;


			while(num[i]>0)
			{
				temp=num[i];
				n1=num[i]%10;
				num[i]=num[i]/10;
				n2=num[i]%10;
				num[i]=num[i]/10;
				n3=num[i]%10;
				num[i]=num[i]/10;
			}
			if(n1+n2==n3 || n2+n3==n1 || n3+n1==n2)
			{
				System.out.println(temp);
			}
			x++;
		}
		//	for(int j=0;j<num.length;j++)
		//	System.out.println(num[j]);

	}

}
