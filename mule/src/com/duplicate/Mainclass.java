package com.duplicate;

import java.util.Arrays;

public class Mainclass {
	static void findDuplicates(String s){
		
			int count=0;
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			for(int i=0;i<ch.length;i++){
				System.out.println(ch[i]);
			}

			for(int i=0;i<ch.length;i++)
			{
				count=0;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]='@';	
					}	
				}
				if(ch[i]!='@')
				System.out.println("frequency of "+ch[i]+ " is "+(count+1));
			}
		}
	
public static void main(String[] args){
	String s="geeethha";
		findDuplicates(s);
	
}
}
