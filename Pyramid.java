package myPack;

import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		in.close();
		for(int i=num;i>=1;i--)
		{
			int count=0;
			while(count<2)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
	}
}
