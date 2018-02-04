
public class Fibanacci {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int f1=0,f2=1,f=0,n=10;
		System.out.println(f1);
		System.out.println(f2);
		while(f<=10)
		{
		f=f1+f2;
		System.out.println(f);
		f1=f2;
		f2=f;
		}

	}

}
