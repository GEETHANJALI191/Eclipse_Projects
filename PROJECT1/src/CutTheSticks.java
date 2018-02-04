public class CutTheSticks {

	public static void main(String[] args) {
		int[] a={5,4,4,2,2,8};
		//int[] b=cutSticks(a);
		//for(int i=0;i<b.length;i++){
			//System.out.println(b[i]);
		//}
		cutSticks(a);

	}
	 static void cutSticks(int[] lengths)
	 {
		 int n=lengths.length,temp=0;
		 int[] arr=new int[10];
		 int k=0;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(lengths[i]<lengths[j])
				 {
					 temp=lengths[i];
					 lengths[i]=lengths[j];
					 lengths[j]=temp;
				 }
			 }
		 }
		// for(int m:lengths)
			// System.out.println(m);
		 int min=lengths[n-1],index=n-1,count=0;
		 while(index>0 && lengths[index]!=0)
		 {
			 for(int i=0;i<index;i++)
			 {
				 lengths[i]=lengths[i]-min;
				 count++;
				 if(lengths[i]==0)
					 index--;
			 }
			 arr[k++]=count;
			 count=0;
			 if(index>=0)
				 min=lengths[index];
			 
		 }
		 int[] str=new int[k];
		 for(int i=0;i<k;i++){
			 str[i]=arr[i];
		 }
		 
		 
			  
		 }
}
