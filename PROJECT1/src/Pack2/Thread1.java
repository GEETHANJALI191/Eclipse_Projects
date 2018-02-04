package Pack2;

import java.util.Scanner;

public class Thread1 extends Thread {
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		try{
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
	}
}


class Thread2 extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		try{
		if(num%2!=0)
		{
			System.out.println("number is odd");
		}
		else
			System.out.println("number is even");
			Thread.sleep(250);
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
	}

}

