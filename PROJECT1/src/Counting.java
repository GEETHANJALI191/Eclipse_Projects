
public class Counting {

	public static void main(String[] args) {
		int[] ar=getOneBits(161);
		for(int n:ar){
		System.out.println(n);
		}
	}
		// TODO Auto-generated method stub
	static int[] getOneBits(int n)
	{
		int b=0;
		int count=0;
	int temp=n;
	while(n>0)
	{
		if(n%2!=0)
		b++;
		n=n/2;
		count++;
	}
	int[] a=new int[count];
	for(int i=count-1;i>=0;i--)
	{
		a[i]=temp%2;
		temp=temp/2;
	}
	int c[]=new int[b+1];
	c[0]=b;
	int num=1;
	for(int j=0;j<count;j++)
	{
		if(a[j]==1)
			c[num++]=j+1;
	}
	return c;
	}
}


