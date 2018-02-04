import java.util.Scanner;


public class Eample2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="mindtree";
		char[] c=str.toCharArray();
		int n=c.length;
		char temp=' ';
		//System.out.println(n);
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(c[j-1]>c[j])
				{
					temp=c[j-1];
					c[j-1]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int m:c)
			System.out.println((char)m);
		binarySearch(c,0,c.length);

	}
	public static void binarySearch(char[] c,int low,int high){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		char ch=sc.next().charAt(0);
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(c[mid]<ch)
			
				low=mid+1;
			
			else
			
				if(c[mid]==ch)
				{
					System.out.println("element found at position: "+(mid+1));
					break;
				}
				else
				
					high=mid-1;
				
				mid=(low+high)/2;
			
		}
		if(low>high)
			System.out.println("element is not found");
		
	}

}
