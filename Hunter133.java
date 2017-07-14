package myPack;

import java.util.Scanner;

public class Hunter133
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.nextLine();
		in.close();
		String[] s=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
}
