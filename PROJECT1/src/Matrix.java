import java.util.Scanner;
public class Matrix {

	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		String arr1[][]=new String[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}

		for(int c=0;c<3;c++){
			for(int i=0;i<3;i++)
			{
				for(int j=i+1;j<3;j++)
				{
					if(a[c][i]>a[c][j])
					{
						int temp=a[c][i];
						a[c][i]=a[c][j];
						a[c][j]=temp;
					}
				}
			}

		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
		
		

	}

}
