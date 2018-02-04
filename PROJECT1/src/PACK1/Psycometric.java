package PACK1;

public class Psycometric {

	public static void main(String[] args) 
	{
		int[] sco={1,3,5,6,8};
		int[] lower={2};
		int[] upper={6};
		int[] res=Psycometric.jobOffers(sco, lower, upper);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
	}
	}

	
	
	public static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits)
	{
		int[] a=new int[lowerLimits.length];
		for(int j=0;j<lowerLimits.length;j++)
		{
			int count=0;
			for(int i=0;i<scores.length;i++)
			{
				if(scores[i]>=lowerLimits[j] && scores[i]<=upperLimits[j])
				{
					count++;
				
			    }
			}
			a[j]=count;
			
			
		}
		return a;
		
	}

}
