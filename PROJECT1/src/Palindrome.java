
public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		int count=0;
		boolean p=false;
		char[] s=str.toCharArray();
		int n=s.length;
		for(int i=0;i<s.length/2;i++)
		{
			if(s[i]!=s[n-1-i])
			{
			p=false;
				
				
			}
			else{
				p=true;
			}
		}
			if(p==true)
			{
				System.out.println("palindrome");
			}
			else{
				System.out.println("not palindrome");
			}
		}
		
	}


