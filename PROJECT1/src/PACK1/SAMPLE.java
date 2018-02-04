package PACK1;

public class SAMPLE {
	public static void main(String[] args){
		int s=getIntegerComplement(5);
		System.out.println(s);
	}
	
	static int getIntegerComplement(int n)
	{
		int sum=0;
		int temp=0,i=0;
		int[] arr=new int[100];
		int[] arr1=new int[100];
		while(n>0)
		{
			arr[i]=n%2;
			n=n/2;
			arr1[i]=1-arr[i];
			i++;
			
		}
		for(int j=0;j<i-1;j++){
			temp=(int)(Math.pow(2,j));
			sum=sum+arr1[j]*temp;
	}
	return sum;
	
}

	
	}
