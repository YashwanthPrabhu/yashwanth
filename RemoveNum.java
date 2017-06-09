import java.util.Scanner;

public class RemoveNum {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		String str=in.next();
		int len=str.length();
		int num=Integer.parseInt(str);
		if(num>0)
		{
			int[] arr=new int[len];
		for(int i=0;i<len;i++)
		{
		arr[i]=num%10;
		num=num/10;
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int[] b=new int[3];
		System.arraycopy(arr, len-3, b, 0, 3);
		for(int i=0;i<len;i++)
		{
			if(arr[i]==b[0]||arr[i]==b[1]||arr[i]==b[2])
			{
				continue;
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		}
		else
		{
			int l=len-1;
			int[] arr=new int[l];
			num=0-num;
			for(int i=0;i<l;i++)
			{
			arr[i]=(num)%10;
			num=num/10;
			}
			for(int i=0;i<l;i++)
			{
				for(int j=i+1;j<l;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.print("-");
			int[] b=new int[3];
			System.arraycopy(arr, l-3, b, 0, 3);
			for(int i=0;i<l;i++)
			{
				if(arr[i]==b[0]||arr[i]==b[1]||arr[i]==b[2])
				{
					continue;
				}
				else
				{
					System.out.print(arr[i]);
				}
			}	
		}
	}

}