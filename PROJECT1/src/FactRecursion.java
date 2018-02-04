
public class FactRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int f=factorial(num);
		System.out.println(f);

	}
	public static int factorial(int a){
		if(a==1){
			return 1;
		}
			else{
				int x=a*factorial(a-1);
				return x;
			}
		}
	}


