import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args)
	{
		int[]a ={3,11,7,21,56,78,100};
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
		int min=a[i];
	   int pos=i;
	      for(int j=i+1;j<a.length;j++)
	    {
		if(a[j]<min)
		{
			min=a[j];
			pos=j;
			
		}
		
	   }
	     int temp=a[i];
	     a[i]=a[pos];
	     a[pos]=temp;	
		}
             for(int i=0;i<a.length;i++)
             {
             System.out.println(a[i]);
             }
	
	BinarySearch(a,0,n-1);	
	}
public static void BinarySearch(int[] arr,int low,int high)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element to b searched");
	int element=sc.nextInt();
	int mid=(low+high)/2;
	while(low<=high)
	{
		if(arr[mid]<element)
			low=mid+1;
		else if(arr[mid]==element)
		{
			System.out.println("element is found at position:"+(mid+1));
			break;
	    }
		else
			high=mid-1;
		mid=(low+high)/2;
     }
	if(low>high)
		System.out.println("element not found");
	
}
}














