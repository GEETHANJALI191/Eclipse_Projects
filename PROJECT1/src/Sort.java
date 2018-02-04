
public class Sort {

	public static void sortArray(int[] a,int n){

		for(int i=0;i<n;i++)
		{
			int min=a[i];
			int pos=i;
			for(int j=i+1;j<n;j++)
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
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}
}
