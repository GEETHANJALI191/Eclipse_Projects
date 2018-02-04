
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method student
		String str1="creative";
		String str2="reactive";
		int count=0;
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		int n1=a.length;
		int n2=b.length;
		if(n1!=n2)
		{
			System.out.println("length not equal");
		}
		else
		{
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(a[i]!=b[j])
				{
					continue;
				}
				count++;
				break;
			}
		}
		}
		if(count==a.length){
			System.out.println("anagram");
		}
		else{
			System.out.println("not panagram");
		}

	}

}
