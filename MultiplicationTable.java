import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+num+"="+(i*num));
		}
	}

}
