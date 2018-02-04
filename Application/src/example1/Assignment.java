package example1;
class StudNotFoundEx extends Exception
{
	//public StudNotFoundEx()
	//{
	//	super();
	//}
}

public class Assignment
{
	public void Find(String studentId) throws StudNotFoundEx{
		if(studentId.equals("12345")){
			System.out.println("student found");
		}
		else{
			throw new StudNotFoundEx();

		}
	}
}



