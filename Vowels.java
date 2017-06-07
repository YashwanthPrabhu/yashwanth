import java.util.Scanner;

public class Vowels {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=in.next();
		char[] v={'a','e','i','o','u','A','E','I','O','U'};
		int len=s1.length();
		int count=0;
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer s2=sb.reverse();
		String s3=new String(s2);
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(s3.charAt(i)==v[j])
				{
					count++;	
				}
			}
			if(count==0)
			{
				System.out.print(s3.charAt(i));
			}
			count=0;
		}
		
	}

}
