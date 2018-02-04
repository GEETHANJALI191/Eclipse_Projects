import java.util.Scanner;


public class Binary {
	public static void BinarySearch(int[] arr,int low,int high){
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
