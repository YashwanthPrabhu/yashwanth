import java.util.Scanner;

public class Remove3 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		String str=in.next();
		int len=str.length();
		int[] arr=new int[len];
		int num=Integer.parseInt(str);
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

}
