package myPack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AndyDictionary 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		TreeSet<String> ts=new TreeSet<String>();
		String s="";
		System.out.println("Enter the input.. Enter STOP to stop reading input");
		while(!s.equalsIgnoreCase("stop"))
		{
			s=in.nextLine();
			StringBuffer sb=new StringBuffer(s);
			for(int i=0;i<sb.length();i++)
			{
				if(sb.charAt(i)=='.'||sb.charAt(i)==','||sb.charAt(i)=='!')
				{
					sb.deleteCharAt(i);
				}
			}
			String temp=sb.toString();
			String str[];
			str=temp.split(" ");
			for(int i=0;i<str.length;i++)
			{
				ts.add(str[i].toLowerCase());
			}
			if(s.contains("stop"))
			{
				s="stop";
			}
		}
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		in.close();
	}
}
