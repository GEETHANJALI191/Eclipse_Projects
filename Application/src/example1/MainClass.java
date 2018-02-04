package example1;
public class MainClass {
	public static void main(String[] args) {
		Assignment a=new Assignment();
		try{
			a.Find("123");

		}catch(StudNotFoundEx ex){
			System.out.println(ex);
		}
	}

}
