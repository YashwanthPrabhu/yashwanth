package myPack;

import java.util.Scanner;

public class Hunter96
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.next();
		for(int i=0;i<str.length();i++)
		{
			if(i==str.length()-1)
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				System.out.print((str.charAt(i)==97||str.charAt(i)==65)?(char)(str.charAt(i)+25):(char)(str.charAt(i)-1));
			}
		}
	}
}
