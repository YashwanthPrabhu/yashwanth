package myPack;

import java.util.Scanner;

public class NextNum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int len=s.length();
		int num=Integer.parseInt(s);
		int num2=num+1;
		String s2=Integer.toString(num2);
		int len2=s2.length();
		if(len==len2)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println("NOT POSSIBLE");
		}
	}

}
