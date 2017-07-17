package myPack;

import java.util.Scanner;

public class Hunter77
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		in.close();
		String s=String.valueOf(num);
		char[] arr =s.toCharArray();
		for(int i=1;i<s.length();i++)
		{
			System.out.print((arr[i]>arr[i-1])?"-1":arr[i]);
			if(i==s.length()-1)
			{
				System.out.println((arr[i]>arr[0]?arr[0]:"-1"));
			}
		}
	}
}
