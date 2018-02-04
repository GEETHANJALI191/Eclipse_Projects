import java.util.Scanner;


public class Example3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int count1=0,length=0;
		String[] parts = s.split(" ");
		for(String s1:parts)
		System.out.println("string arr is "+s1);
		
		for(int i=0;i<parts.length;i++)
		length+=parts[i].length();
		
		System.out.println("number of letters in an string is:"+length);
		if(length<10){
			System.out.println("please enter the string once again");
			s=sc.next();
		}
		char[] arr=new char[50];
		int k=0;
		for(int i=0;i<s.length();i++)
		{ char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				arr[k++]=s.charAt(i);
				count1++;
			}
		
		}
		if(count1<5)
		{
			System.out.println("string doesnot have atleast five characters");
		}
		for(int m=0;m<k;m++){
			System.out.println(arr[m]);
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(char c:arr)
			System.out.println(c);
	}
}
	

			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

