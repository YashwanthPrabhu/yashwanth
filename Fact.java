import java.util.Scanner;

public class Fact {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		int fact=1;
		if(num<0)
		{
			for(int i=num;i<0;i++)
			{
				fact=fact*i;
			}
		}
		else
		{
			for(int i=num;i>0;i--)
			{
				fact=fact*i;
			}
		}
		System.out.print(fact);
	}

}