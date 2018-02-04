package Pack2;

public class Demo {

	public static void main(String[] args) {
		Object[] obj=new Object[5];
		obj[0]=new Student(123,"geetha",50.0);					//here i have created only two objects but size of the array is of five so when i try to print it shows null pointer exception
		//so i need to write the condition if(stu[i]!=null)
		obj[1]=new Student(234,"jeevitha",56.0);
		obj[2]=new Employee(1043,"geethanajali");
		obj[3]=new Employee(1045,"jeevitha");
		Sample s=new Sample();
		s.display(obj);
		
	}

}
