
public class CutSticks {

	public static void main(String[] args) {
		int[] arr={5,4,4,2,2,8};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int m:arr)
			System.out.println(m);
		System.out.println();
		int count=0;
		int[] a=new int[10];
		int k=0;

		int index=n-1;
		int small=arr[index];
		while(index>=0 && arr[index]!=0)
		{
			for(int i=0;i<n;i++)
			{
				if(arr[i]!=0)
				{
					arr[i]=arr[i]-small;
					count++;
					if(arr[i]==0)
						index--;
				}
			}
			a[k++]=count;
			count=0;


			if(index>=0)
				small=arr[index];
		}
		int b[]= new int[k];
		for(int i=0;i<k;i++){
			b[i]=a[i];
		}

	}

}

