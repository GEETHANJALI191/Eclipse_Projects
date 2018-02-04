
public class Hackland {

	public static void main(String[] args) {
		String[] s1={"geetha","pinku","geetha","pinku"};
		String s2=Hackland.electionWinner(s1);
		System.out.println(s2);
	}
	
	static String electionWinner(String[] votes)
	{
		String[] str=new String[10];		
		String temp=" ";
		int k=0;
		for(int i=0;i<votes.length;i++)
		{
			for(int j=i+1;j<votes.length;j++)
			{
				if((votes[i].compareTo(votes[j])==0))
				{
					str[k++]=votes[i];
				}
			}
		}
	for(int i=0;i<k;i++)
	{
		for(int j=i+1;j<k;j++)
		{
			if((str[i].compareTo(str[j])>0))
			{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
	}
	return str[k-1];
	}	
}
