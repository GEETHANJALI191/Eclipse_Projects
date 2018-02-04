
public class BitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=BitGame.maxXor(2, 4, 8);
		System.out.println(m);

	}
	
	 static int maxXor(int left, int right, int k)
	 {
		 int max=0;
		 for(int i=left;i<=right;i++)
		 {
			 for(int j=left+1;j<=right;j++)
			 {
					if((i^j)>max && (i^j)<=k)
					{
						max=i^j;
					}
			 }
		 }
		 return max;

	 }
	 
}

