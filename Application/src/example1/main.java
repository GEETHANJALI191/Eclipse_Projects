package example1;

public class MainClass1
{

	public static void main(String[] args)
	{

		System.out.println("main method");
		
		Demo1 d=new Demo1();
		Demo1.print();
		d.display();
		Demo1.x=10;
		d.y=20.8;
		System.out.println(Demo1.x);

		System.out.println(d.y);
	}

}
