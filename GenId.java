import java.util.Scanner;

public class GenId {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first name and last name");
		String s1=in.next();
		String s2=in.next();
		String s3;
		if(s1.length()<s2.length())
		{
			s3=s1;
			s1=s2;
			s2=s3;
		}
		else if(s1.length()==s2.length())
		{
			if(Character.toLowerCase(s1.charAt(0))>Character.toLowerCase(s2.charAt(0)))
			{
				s3=s1;
				s1=s2;
				s2=s3;
			}
		}
		System.out.println("Enter the pin");
		String s4=in.next();
		int l=s4.length();
		System.out.println("Enter the index N");
		int n=in.nextInt();
		String id=s1.charAt(0)+s2+s4.charAt(n-1)+s4.charAt(l-n);
		int l2=id.length();
		for(int i=0;i<l2-2;i++)
		{
			if(Character.isLowerCase(id.charAt(i)))
			{
				System.out.print(Character.toUpperCase(id.charAt(i)));
			}
			else
			{
				System.out.print(Character.toLowerCase(id.charAt(i)));
			}
		}
		String ss=id.substring(l2-2,l2);
		int num=Integer.parseInt(ss);
		System.out.println(num);
	}

}