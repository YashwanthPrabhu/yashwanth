import java.util.Scanner;

public class PartOf {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two word");
		String s1=in.next();
		String s2=in.next();
		int l1=s1.length();
		int l2=s2.length();
		int count=0;
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j)&&i<l1-1&&j<l2-1)
				{
					if(s1.charAt(i+1)==s2.charAt(j+1))
					{
						count++;
					}
				}
			}
		}
		System.out.println((count>0)?"True":"False");
	}

}
