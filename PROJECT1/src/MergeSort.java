
public class MergeSort {

	public static void main(String[] args) {
		int[] a={5,8,1,15,4,9};
		int n=a.length;
		int low=0;
		int high=n-1;
		MergeSort(a,low,high);
		for(int m:a){
        	System.out.println(m);
        }

	}
	public static void  MergeSort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			MergeSort(a,low,mid);
			MergeSort(a,mid+1,high);
			merge(a,low,high);
		}
		
	}
	
	public static void merge(int[] a,int low,int high){
		
		int[] arr=new int[a.length];
		int mid=(low+high)/2;
		 int i = low;
	        int j = mid + 1;
	        int k = low;
	        while (i <= mid && j <= high)
	        {
	            if (a[i] <= a[j])
	            {
	                arr[k] = a[i];
	                i++;
	            } else 
	            {
	                arr[k] = a[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= mid)
	        {
	            arr[k] = a[i];
	            k++;
	            i++;
	        }
	        while (j<= high)
	        {
	            arr[k] = a[j];
	            k++;
	            j++;
	        }
	        for(int l=low;l<=high;l++){
	        	a[l]=arr[l];
	        }
	        

	}
	

}
