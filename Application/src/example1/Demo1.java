package example1;

public class Demo1 {
	static int x;
	double y;
	static{
		System.out.println("static block ");
	}
	{
		System.out.println("non static block");
	}
	public Demo1(){
		System.out.println("constructor is executing");
		
	}
	
	public static void print(){
		System.out.println("static method executing");
	}
	public void display(){
		System.out.println("non static method executing ");
	}

}
