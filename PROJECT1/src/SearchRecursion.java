import java.util.Scanner;
public class SearchRecursion {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		char[] c=s.toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++)
		{
			int min=c[i];
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(c[j]<min)
				{
					min=c[j];
					pos=j;
				}
			}
			char temp=c[i];
			c[i]=c[pos];
			c[pos]=temp;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println((char)c[i]);
		}

		System.out.println("enter the element to be searched");
		char key=sc.next().charAt(0);
		int index=recursiveBinarySearch(c,0,c.length,key);
		Scanner sc1=new Scanner(System.in);
		System.out.println("element is present in the position:"+(index+1));


	}
	public static int recursiveBinarySearch(char[] c, int start, int end,char key)
	{
		if (start < end)
		{
			int mid = start + (end - start) / 2;  
			if (key < c[mid]) 
			{
				return recursiveBinarySearch(c, start, mid,key);

			} else if (key > c[mid])
			{
				return recursiveBinarySearch(c, mid+1, end,key);

			} else
			{
				return  mid;   
			}
		}
		return (start + 1);  

	}
}
