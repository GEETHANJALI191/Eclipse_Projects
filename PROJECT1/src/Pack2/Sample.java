package Pack2;

public class Sample {
	public void display(Object[] arg)
	{
		for(int i=0;i<arg.length;i++)
		{
			if(arg[i]!=null)
			{
				if( arg[i] instanceof Student)
				{
				Student s1=(Student)arg[i];
				System.out.println(s1.rollno+"\t "+s1.name+"\t "+s1.marks);
			     }
				else{
					if( arg[i] instanceof Employee)
					{
					Employee s1=(Employee)arg[i];
					System.out.println(s1.empid+"\t "+s1.name1);
				     }
				}
			}

		}
	}
	      

}
