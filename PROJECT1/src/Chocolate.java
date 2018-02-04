public class Chocolate {

	public static void main(String[] args) {
		int[] c={4,2,3,7,9,2};
		Chocolate.calculate(c);

	}
	
	public static void calculate(int[] arr)
	{   
		 long n;
		for(int i=0;i<arr.length;i++){
			if (arr[i]==1 || arr[i]==2){
				System.out.println(1);
				continue;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				n=arr[i]/2+1;
			}
			else
			{
				n=arr[i]/2;
			}
			System.out.println(n*n);
		}
		
		
	}
}



