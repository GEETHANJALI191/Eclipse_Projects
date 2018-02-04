
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr={'s','a','a','t','a','t','g'};
		char[] a=new char[10];
		int k=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='*';
			    }
				else
				{
					continue;
				}
				
			}	
			if(arr[i]!='*')
			{
			a[k++]=arr[i];
			}
			
			
				
		}
		
		for(int j=0;j<k;j++)
		System.out.println(a[j]);
	}

}

