package myPack;

import java.util.Scanner;

public class CoPrime
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=in.nextInt();
		int num2=in.nextInt();
		System.out.println((isPrime(num1)&&isPrime(num2)?"Co-Prime":"Not Co-Prime"));
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
