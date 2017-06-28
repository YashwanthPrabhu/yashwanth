package myPack;

import java.util.Scanner;

public class Test 
{
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	int upper=in.nextInt();
    	int lower=in.nextInt();
    	int temp=0;
    	int sum=0;
    	for(int i=1;i<upper;i++)
    	{
    		temp=temp+i;
    	}
    	for(int j=1;j<lower;j++)
    	{
    		sum=sum+(temp*j);
    	}
    	System.out.println(sum);
    }
}
