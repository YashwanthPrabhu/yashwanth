package myPack;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=in.nextInt();
		System.out.println("Enter "+size+" elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("How many times do you want to rotate the array??");
		int t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
			int temp=arr[0];
			for(int j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[size-1]=temp;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
