
public class Recursion {

	public static void main(String[] args) {
		String name="geetha";
		String s=Recursion.reverseString(name);
		System.out.println(s);
		

	}

public static String reverseString(String str){
	String rev="";
    if(str.length() == 1)
    {
        return str;
    } else 
    {
    	rev=rev+str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }
    return rev;
}
 

}