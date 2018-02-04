package Problem;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args){
	String s = "hello java how do you do";
    System.out.println(Arrays.toString(Reverse.split(s)));
}

public static String[] split(String s) {
    int count = 0;
    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++)
    {
        if (c[i] == ' ') 
        {
            count++;
        }
    }
    String temp = "";
    int k = 0;
    String[] rev = new String[count + 1];
    for (int i = 0; i < c.length; i++) 
    {
        if (c[i] == ' ')
        {
            rev[k++] = temp;
            temp = "";
        } else
            temp = temp + c[i];
    }
    rev[k] = temp;
    return rev;
}
}
