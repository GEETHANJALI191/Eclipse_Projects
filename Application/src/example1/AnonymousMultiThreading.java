package example1;
import java.util.Scanner;
class Demo 
{
	public Demo()
	{
		Thread t=new Thread()
		{
			public void run() 
			{
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			int n=s.nextInt();
			int i=1;
			while(i<=10)
			{
			int n1=n*i;
			System.out.println(n+"*"+i+"="+n1);
			try
				{
				Thread.sleep(300);
				}
			catch(Exception e)
				{

				}
			i++;
			}
			}
	};
	t.start();
  }
}

	
public class AnonymousMultiThreading {
	public static void main(String[] args){
		new Demo();
	}
}
