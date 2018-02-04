package PACK1;

public class Lastcharacter {

	public static void main(String[] args) {
String str=lastLetters("HACK");
System.out.println(str);
	}
	static String lastLetters(String word)
	{
		
		int len=word.length();
	String s="";
	s+=word.charAt(len-1);
	s+=" ";
	s+=word.charAt(len-3);
	
	return s;

}
}
