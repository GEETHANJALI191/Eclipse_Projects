import java.util.Scanner;
public class Stack {
	public static void main(String[] args) 
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("size");
			  int capacity = sc.nextInt();
			  
			 int arr[] = new int[capacity];        
			 int top = -1;
			 int ch=0;
			 while(ch!=4){
				 System.out.println("select the operation");
				 System.out.println("1.push");
				 System.out.println("2.pop");
				 System.out.println("3.display");
				 System.out.println("4.exit");
				 ch=sc.nextInt();
				 switch(ch){
				 case 1:
					 	System.out.println("enter the element to be inserted");
				 		int input=sc.nextInt();
				 		if (top < capacity - 1)
				 		{
				 			top++;
				 			arr[top] = input;
				 		} 
				 		else 
				 		{
				 			System.out.println("Stack Overflow !");
				 		}
				 		break;
				 case 2:
					 		if (top >= 0)
							  {
					 			System.out.println(arr[top]);
							   top--;
							   System.out.println("Pop operation done !");
							   
							  } 
							  else 
							  {
							   System.out.println("Stack Underflow !");
							  }
					 		break;
				 case 3:
					 		System.out.println("displaying stack elements");
					 		 if (top >= 0) 
					 		 {
					 			   System.out.println("Elements in stack :");
					 			   for (int i = top; i>=0; i--)
					 			   {
					 			    System.out.println(arr[i]);
					 			   }
					 		 }
					 		 else{
					 			 System.out.println("stack underflow");
					 		 }
					 		 break;
				 case 4:break;
				 default:System.out.println("enter valid option");

					 		
				 }
				 }
				 

		  sc.close();
		 }

	}


