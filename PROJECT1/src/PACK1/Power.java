package PACK1;

public class Power {
	public static void main(String[] args){
		int[] a={3,2,7,4};
		int len=a.length;
		int s[]=new int[len];
		for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
		}
	}
	
	
	
	
	static int[] isPowerOf2(int[] nums) {
		 int l=nums.length;
			int[] arr1=new int[l];
	    for(int i=0;i<l;i++)
	    {
			for(int j=0;j<=50;j++)
			{
					if(Math.pow(2,j)==nums[i])
	                {
	                 arr1[i]=1;
	                    break;
	                }
	 
					else 
	                    arr1[i]=0;
			}
	    }
			return arr1;
	}
}
	
				
				
		
		
	


