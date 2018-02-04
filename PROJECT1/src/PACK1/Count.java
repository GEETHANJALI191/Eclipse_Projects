package PACK1;

public class Count {

	public static void main(String[] args)
	{
		int[] l={2,3,3,4,2,1};
		int s=Count.countDuplicates(l);
			System.out.println(s);
	}
	static int countDuplicates(int[] numbers)
	{
		 int n=numbers.length;
	        int sum=0;
	     for(int i=0;i<n;i++)
	     {
	         int count=0;
	       for(int j=i+1;j<n;j++)
	       {
	           if(numbers[i]==numbers[j] && numbers[i]!=0 && numbers[j]!=0)
	           {
	               numbers[j]=0;
	           count++;
	           }
	          
	       }
	         if(count>0)
	             sum=sum+1;
	      }
	     return sum;
	   }

	}

