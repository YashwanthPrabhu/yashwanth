package myPack;

import java.util.Scanner;

public class Pro63
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.next();
		in.close();
		String s="";
		String s1="";
		String out=new String();
		int big=0;
		int temp_len=0;
		for(int i=0;i<str.length();i++)
		{
			s1=s1+str.charAt(i);
			if(s.contains(s1))
			{
				temp_len=s.length();
				if(temp_len>big)
				{
					big=temp_len;
					out=s;
				}
				s="";
				s=s+s1;
			}
			else
			{
				s=s+s1;
			}
			s1="";
		}
		System.out.println(out+" "+out.length());
	}
}
