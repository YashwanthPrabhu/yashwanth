package myPack;

import java.util.Scanner;

public class BinaryNumber 
{
	public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    	int k=in.nextInt();
    	int tot=(int) Math.pow(2,k);
    	for(int i=0;i<tot;i++)
    	{
    		String s=Integer.toBinaryString(i);
    		int len=s.length();
    		if(len<k)
    		{
    			for(int j=1;j<=k-len;j++)
    			{
    				System.out.print("0");
    			}
    		}
    		System.out.println(s);
    	}
    }
}
