
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={7,2,1,6};
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}

	}

}
