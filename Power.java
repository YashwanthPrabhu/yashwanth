import java.util.Scanner;

public class Power {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int a=num;
		System.out.println("Enter power");
		int p=input.nextInt();
		for(int i=1;i<p;i++)
		{
			a=a*num;
		}
		System.out.println(a);
		
	}

}
