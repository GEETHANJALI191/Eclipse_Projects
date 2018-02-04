package Pack2;

import java.util.Scanner;

public class ThreadPalindromeNumber extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int count=0,reverse=0;
		try{
			while (n != 0) {
	            int remainder = n % 10;
	            reverse = reverse * 10 + remainder;
	            n = n / 10;
	        }

	        if (temp == reverse) {
	            System.out.println("number is palindrome");
	        }
	        else{
	        	System.out.println("number is not palindrome");
	        }

		}
		catch(Exception ex){
			System.out.println(ex);
		}
		

}
}
