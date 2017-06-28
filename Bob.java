package myPack;

import java.util.Scanner;

public class Bob {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of t");
		int t=in.nextInt();
		int temp=3;
		int a=temp;
		for(int i=1;i<=t;i++)
		{
			if(i!=1)
			{
				a--;
			}
			if(a==0)
			{
				a=2*temp;
				temp=a;
			}
			if(i==t)
			{
				System.out.println(a);
			}
		}

	}

}
