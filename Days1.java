import java.util.HashSet;
import java.util.Scanner;

public class Days {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a day");
		String str=in.next();
		StringBuilder sb=new StringBuilder(str);
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		String s2=new String(sb);
		HashSet<String> hr=new HashSet<String>();
		hr.add("monday");
		hr.add("tuesday");
		hr.add("wednesday");
		hr.add("tuesday");
		hr.add("friday");
		if(hr.contains(s2))
		{
			System.out.println("True");
		}
                else
                {
                        System.out.println("False");
                }
	}

}
