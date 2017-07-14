package myPack;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hunter88
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the input");
		String s=in.next();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=s.length()-1;i>=0;i--)
		{
			hs.add(s.charAt(i));
		}
		Iterator<Character> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		in.close();
	}
}
