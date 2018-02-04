public class Abc {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] rev=new String[4];
		String[] r=new String[4];
		String res=" ";
		rev[0]="good";
		rev[1]="bad";
		rev[2]="girl";
		rev[3]="boy";
		char temp=' ';
		for(int i = 0; i < rev.length; i++)
		{
			for(int j=0;j<rev[i].length();j++)
			{
				char[] c=rev[i].toCharArray();
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
	
		for(int i=0;i<4;i++){
			 res=res+" "+r[i];
		}
		System.out.println(res);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

		
	