
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a ={3,1,7,2};
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
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}

	}

}
