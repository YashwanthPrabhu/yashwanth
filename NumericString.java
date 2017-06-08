import java.util.Scanner;

public class NumericString {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.next();
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if((str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)>=97&&str.charAt(i)<=122))
			{
				count++;
			}
		}
		System.out.println((count==0)?"True":"False");
	}

}
