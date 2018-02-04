
public class AmazingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"ab","aab","abaab"};
		int[] a=AmazingStrings.minimalOperations(str);
	}
	static int[] minimalOperations(String[] words){
		int[] c=new int[words.length];
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			char[] arr=words[i].toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				
				if( j!=arr.length-1  &&  arr[j]==arr[j+1] )
				{
					arr[j+1]='g';
					j=j+1;
					count++;
					
				}
			}
			c[i]=count;
			count=0;
		}
		return c;
	}

}
