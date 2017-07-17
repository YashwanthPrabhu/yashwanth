package myPack;

import java.util.Scanner;

public class Hunter72 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		in.close();
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				StringBuffer sb1=new StringBuffer(arr[i]);
				StringBuffer sb2=sb1.reverse();
				arr[i]=new String(sb2);
			}
		}
		for(String s:arr)
		{
			System.out.print(s+" ");
		}
	}
}
