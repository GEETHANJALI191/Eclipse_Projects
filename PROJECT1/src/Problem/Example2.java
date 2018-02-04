package Problem;

public class Example2 {

	public static void main(String[] args) {
		
			Demo1 d1=new Demo3();		//implicit upcasting
			Demo2 d2=(Demo2)d1;			//explicit downcasting
			Demo3 d3=(Demo3)d1;
			
			System.out.println(d1.x);
			d1.test();
			//    System.out.println(d1.y);
			
			// d1.read();   cannot access
			
			System.out.println(d2.y);
		//	System.out.println(d2.a);   cannot access
	}

}
