package myPack;

import java.util.Scanner;

public class IntegerSum 
{
   public static void main(String args[])
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter a string");
	   String str=in.next();
	   String temp=new String();
	   int count=0;
	   int big=0;
	   int small=10;
	   int n=0;
	   int sum1=0;
	   int sum2=0;
	   for(int i=0;i<str.length();i++)
	   {
		   if(Character.isDigit(str.charAt(i)))
		   {
			   count++;
		   }
	   }
	   int[] arr=new int[count];
	   for(int i=0;i<str.length();i++)
	   {
		   if(Character.isDigit(str.charAt(i)))
		   {
			  temp=str.substring(i,i+1);
			  arr[n]=Integer.parseInt(temp);
			  if(arr[n]>big)
			  {
				  big=arr[n];
			  }
			  if(arr[n]<small)
			  {
				  small=arr[n];
			  }
			  n++;
		   }
	   }
	   for(int i=0;i<count;i++)
	   {
		   sum1+=arr[i]*big;
		   sum2+=arr[i]*small;
	   }
	   int a=0;
	   int b=0;
	   while(sum1>0)
	   {
		   a=a+sum1%10;
		   sum1=sum1/10;
	   }
	   while(sum2>0)
	   {
		   b=b+sum2%10;
		   sum2=sum2/10;
	   }
	   int c=0;
	   int d=0;
	   while(a>0)
	   {
		   c=c+a%10;
		   a/=10;
	   }
	   while(b>0)
	   {
		   d=d+b%10;
		   b/=10;
	   }
	   System.out.println((c<d)?c*c:d*d);
   }
}
