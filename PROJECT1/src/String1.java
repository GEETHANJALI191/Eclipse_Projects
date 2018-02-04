
public class String1 {

	public static void main(String[] args) 
	{
		char[] A={'s','a','h','a'};
		char[] B={'s','i','m','r','a'};
		char[] a=new char[10];
		int k=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				if(A[i]==B[j])
				{
					a[k++]=B[j];
					B[j]='*';
					break;
				}
				
			}
		}
		for(int j=0;j<k;j++){
		System.out.println(a[j]);
		}
	}

}
