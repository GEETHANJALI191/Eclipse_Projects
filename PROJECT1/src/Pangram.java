public class Pangram {

	public static void main(String[] args) {
		String[] a={"hfduwhdkegdujeyohsljdh","abcdefghijklmnopqrstuvwxyz"};
		String ab=Pangram.isPangram(a);
		System.out.println(ab);
	}

	static String isPangram(String[] strings)
	{
		int len=strings.length;
		int[] a=new int[26];
		int i=0,b=0;
		String str=" ";
		for(i=0;i<26;i++)
		{
			a[i]=0;
		}
		for(i=0;i<len;i++)
		{
			for(int j=0;j<strings[i].length();j++)
			{
				char c=strings[i].charAt(j);
				if(c>='a' && c<='z')
				{
					
					a[c-'a']++;
				}
			}
			for(int k=0;k<26;k++)
			{
				if(a[k]==0)
				{
					str=str+"0";
					break;
					
				}
				else
					b++;
				
			
			}
			if(b==26)
				str+="1";
		}
		return str;
		
		
	}

}
