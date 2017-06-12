import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=in.nextLine();
		int len=str.length();
		HashSet<Character> hs=new HashSet<Character>();
		if(len<26)
		{
			System.out.println("It is not a pangram");
		}
		else
		{
		   for(int i=0;i<len;i++)
		   {
			   if(str.charAt(i)==' ')
			   {
				   continue;
			   }
			   else
			   {
				   hs.add(str.charAt(i));
			   }
		   }
		   System.out.println((hs.size()==26)?"Pangram":"Not a pangram");
		}
	}

}
