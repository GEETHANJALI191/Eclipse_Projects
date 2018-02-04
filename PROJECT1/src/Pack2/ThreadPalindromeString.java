package Pack2;

import java.util.Scanner;

public class ThreadPalindromeString extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int count=0;
		try{
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)==str.charAt(str.length()-1-i))
			{
				count++;
			}
		}
		if(count==str.length()/2){
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not palindrome");

		}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		

	}

}


