package myPack;

import java.util.Scanner;

public class Pro61
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input 1");
		String in1=in.next();
		System.out.println("Enter input 2");
		String in2=in.next();
		String out="";
		for(int i=0;i<in1.length();i++)
		{
			int temp=in1.charAt(i)+10;
			out=out+((temp>122)?(char)(temp-26):(char)(temp));
		}
		out=out+" ";
		for(int i=0;i<in2.length();i++)
		{
			if(i==0||i==in2.length()-1)
			{
				out=out+in2.charAt(i);
			}
			else
			{
				int temp=in2.charAt(i)+10;
				out=out+((temp>122)?(char)(temp-26):(char)(temp));
			}
		}
		System.out.println(out);
		in.close();
	}
}
