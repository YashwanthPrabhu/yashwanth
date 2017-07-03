package myPack;

import java.util.Scanner;

public class PrintVariables {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		String str=in.next();
		String s=new String();
		int len=str.length();
		int sum=0;
		int index=0;
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s=str.substring(i,i+1);
				sum=sum*10+Integer.parseInt(s);
			}
			else if(sum>0)
			{
				for(int j=0;j<sum;j++)
				{
					System.out.print(str.substring(index,index+1));
				}
				index=i;
				sum=0;
			}
			if(i==len-1)
			{
				for(int j=0;j<sum;j++)
				{
					System.out.print(str.substring(index,index+1));
				}
			}
		}
		in.close();
	}

}
