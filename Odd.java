package yaswanth;

import java.util.Scanner;

public class Odd {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter starting value");
		int min=input.nextInt();
		System.out.println("Enter the ending value");
		int max=input.nextInt();
		for(int i=min;i<=max;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
	}

}
