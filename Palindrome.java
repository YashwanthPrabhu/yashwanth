import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=input.next();
		String s1,s2;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					s1=str.substring(i,j+1);
					StringBuffer sb=new StringBuffer(s1);
					StringBuffer ss=sb.reverse();
					s2=new String(ss);
					if(s1.equals(s2))
					{
						System.out.println(s1);
					}
					
				}
			}
		}
	}

}
