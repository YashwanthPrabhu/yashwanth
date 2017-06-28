package myPack;

import java.util.Scanner;

public class NextNum1 {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>0)
		{
			String s=Integer.toString(n);
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
		else
		{
			n=0-n;
			String s=Integer.toString(n);
			int len=s.length();
			int num=Integer.parseInt(s);
			int num2=num-1;
			String s2=Integer.toString(num2);
			int len2=s2.length();
			if(len==len2)
			{
				System.out.println(((num2!=0)?"-":"")+num2);
			}
			else
			{
				System.out.println("NOT POSSIBLE");
			}
		}
	}

}
