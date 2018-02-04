
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,8,1,20,6};
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		int t=arr[1];
		System.out.println("second largest is"+t);

	}

}
