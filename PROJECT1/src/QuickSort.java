
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,3,0,16,1};
		int i=0;
		int j=a.length-1;
		quicksort(a,i,j);
		for(int k:a){
			System.out.println(k);
		}

	}
	public static void quicksort(int a[],int i,int j){
		if(i>=j) return;
		int p1=partition(a,i,j);
		quicksort(a,i,p1-1);
		quicksort(a,p1+1,j);
	}
	
	public static int partition(int[] a,int i,int j){
		
		 int p=i+1;
		 int q=j;
		 int pivot=a[i];
		while(p<=q)
		{
			while(a[p]<=pivot)
				p++;
			while(a[q]>pivot)
				q--;
			if(p<q)
			{
				int temp=a[p];
				a[p]=a[q];
				a[q]=temp;
			}
		}
		a[i]=a[q];
		a[q]=pivot;
		return q;
		
	}

}
