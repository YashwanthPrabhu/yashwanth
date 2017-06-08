import java.util.Scanner;

public class AlphebetOrNot {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Character");
		int count=0;
		char c=in.next().charAt(0);
		if((c>=65&&c<=90)||(c>=97&&c<=122))
		{
			count++;
		}
		System.out.println((count==1)?"Alphabet":"Not an alphabet");
	}
}
