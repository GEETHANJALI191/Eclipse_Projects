public class Test {
	
	public static void main(String[] args)
	{
		String p = "hello java how do you do ";
		String[] res=split(p);
	    sort(res);
	}
	public static String[] split(String s) 
	{
	    int count = 0;
	    char[] c = s.toCharArray();

	    for (int i = 0; i < c.length; i++)
	    {
	        if (c[i] == ' ') 
	        {
	            count++;
	        }
	    }
	    String temp = "";
	    int k = 0;
	    String[] rev = new String[count + 1];						//Splitting words and storing in string array rev
	    for (int i = 0; i < c.length; i++) 
	    {
	        if (c[i] == ' ')
	        {
	            rev[k++] = temp;
	            temp = "";
	        } else
	            temp = temp + c[i];
	    }
	    rev[k] = temp;
	    return rev;
	}
	public static void sort(String[] res)
	{
		int i;
		String[] r=new String[6];
		String result=" ";
		char temp=' ';
		for( i = 0; i < res.length; i++)
		{
			for(int j=0;j<res[i].length();j++)
			{
				char[] c=res[i].toCharArray();						//sorting characters in a words alphabetically
				for(int k=0;k<c.length;k++)
				{
					for(int l=k+1;l<c.length;l++)
					{
						if(c[k]>c[l])
						{
							temp=c[k];
							c[k]=c[l];
							c[l]=temp;
					    }
						r[i] =String.valueOf(c);				  						
				    }
			    }
				
			}
		
		}
		String s1=" ";
		for(int l=0;l<r.length;l++){                                     //sorting words alphabetically
			for(int j=l+1;j<r.length;j++){
				if(r[l].charAt(0)>r[j].charAt(0)){
					String t=r[l];
					r[l]=r[j];
					r[j]=t;
				}
			}
		}
		for(int m=0;m<6;m++)
		{
			 result=result+" "+r[m];
		}
		System.out.println(result);
	}
}

	        


