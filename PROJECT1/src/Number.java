
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rem=0;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
