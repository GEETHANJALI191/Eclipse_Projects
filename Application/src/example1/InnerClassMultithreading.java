package example1;
import java.util.Scanner;
class Outer {
	private int i = 1;
	Outer() {
		Inner i1 = new Inner();
		i1.start();
	}
	private class Inner extends Thread {
		public void run() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			int n=s.nextInt();
			while(i<=10)
			{
				int n1=n*i;
				System.out.println(n+"*"+i+"="+n1);
				try{
					Thread.sleep(300);
				}
				catch(Exception e)
				{

				}
				i++;
			}
		}
	}
}
public class InnerClassMultithreading {
	public static void main(String[] args) {
		new Outer();
	}
}