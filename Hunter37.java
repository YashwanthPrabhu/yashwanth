package myPack;

import java.util.Scanner;

public class Hunter37 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=in.next();
		for(int i=0;i<s.length();i++)
		{
			String str=s.substring(0,i);
			if(i+1<=s.length())
			{
				str=str+s.substring(i+1);
			}
			StringBuffer sb=new StringBuffer(str);
			StringBuffer sb2=sb.reverse();
			String str2=sb2.toString();
			if(str.equalsIgnoreCase(str2))
			{
				System.out.println(i);
			}
		}
	}
}
