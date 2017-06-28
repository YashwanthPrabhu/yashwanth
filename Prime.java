package myPack;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		for(int i=1;i<num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(i==1)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print((count==2)?" "+i:"");
			}
		}

	}

}
