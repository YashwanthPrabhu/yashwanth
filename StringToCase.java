import java.util.Scanner;

public class StringToCase {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=in.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(i==0||(i>0&&str.charAt(i-1)==' '))
			{
				if(Character.isLowerCase(str.charAt(i)))
				{
					System.out.print(Character.toUpperCase(str.charAt(i)));
					continue;
				}
			}
			if(str.charAt(i)!=' ')
			{
				System.out.print(str.charAt(i));
			}
			
		}
	}

}
