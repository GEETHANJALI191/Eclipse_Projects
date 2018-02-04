import java.util.Scanner;
public class Int2DArray
{
	public static void main(String[] args){
	String arr1[][]=new String[2][2];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array elements");
	for(int m=0;m<2;m++)
	{
		for(int n=0;n<2;n++)
		{
			arr1[m][n]=sc.next();
		}
	}
	for(int m=0;m<2;m++)
	{
		for(int n=0;n<2;n++)
		{
			System.out.println(arr1[m][n]);
		}
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			for(int k=j+1;j<2;j++)
			{
				if(arr1[i][j].compareTo(arr1[i][k])>0)
				{
					String temp=arr1[i][j];
					arr1[i][j]=arr1[i][k];
					arr1[i][k]=temp;
					
				}
			}
		}
	}
	System.out.println();
	for(int m=0;m<2;m++)
	{
		for(int n=0;n<2;n++)
		{
			System.out.print(arr1[m][n]+" ");
		}
		System.out.println();
	}
	System.out.println();

	for(int m=0;m<2;m++)
	{
		for(int n=0;n<2;n++)
		{
			System.out.print(arr1[n][m]+" ");
		}
		System.out.println();
	}
	

}
}
