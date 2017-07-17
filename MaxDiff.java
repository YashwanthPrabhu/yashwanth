package myPack;

import java.util.Scanner;

public class MaxDiff
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the elements");
		String s=in.nextLine();
		String str[]=s.split(" ");
		int[] arr=new int[str.length];
		int index=0;
		for(String t:str)
		{
			arr[index]=Integer.parseInt(t);
			index++;
		}
		int big=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int sub=arr[i]-arr[i+1];
			int x=(sub<0)?(0-sub):sub;
			if(x>big)
			{
				big=x;
				index=i;
			}
		}
		System.out.println(index);
		in.close();
	}
}
