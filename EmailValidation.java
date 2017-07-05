package myPack;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an email address");
		String str=in.next();
		int count1=0;
		int count2=0;
		if(str.contains("@")&&str.contains("."))
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='@')
				{
					count1++;
				}
			}
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='.')
				{
					count2++;
				}
			}
			if(count1==1&&count2==1)
			{
				int temp=0;
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='@')
					{
						for(int j=i+1;j<str.length();j++)
						{
							if(str.charAt(j)=='.')
							{
								break;
							}
							temp++;
						}
					}
				}
				int index=str.indexOf("@");
				if(temp>=4&&index>=3&&str.indexOf(".com")==str.length()-4)
				{
					System.out.println("Valid!!");
				}
				else
				{
					System.out.println("Not valid");
				}
			}
			else
			{
				System.out.println("Not valid");
			}
		}
		else
		{
			System.out.println("Not valid");
		}
	}
}
