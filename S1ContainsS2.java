package myPack;

import java.util.Scanner;

public class S1ContainsS2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1=in.next();
		System.out.println("Enter string 2");
		String s2=in.next();
		if(s1.contains(s2))
		{
			System.out.println(s1.indexOf(s2));
		}
		else
		{
			System.out.println("-1");
		}
	}

}
