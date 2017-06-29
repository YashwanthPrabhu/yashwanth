package myPack;

import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the starting number");
    	int start=in.nextInt();
    	System.out.println("Enter the ending point");
    	int end=in.nextInt();
    	int count=0;
    	for(int i=start;i<=end;i++)
    	{
    		int sum=0;
    		int temp=i;
    		while(temp>0)
    		{
    			sum+=temp%10;
    			temp/=10;
    		}	
    		if(isPrimeNumber(sum)==1)
       		{
       			count++;
       		}
    	}
    	System.out.println(count);
    	in.close();
    }
    static int isPrimeNumber(int sum)
    {
    	for(int j=2;j<=sum/2;j++)
    	{
    		if(sum%j==0)
    		{
    			return 0;
    		}
    	}
    	return 1;
    }
}
