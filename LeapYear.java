import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=in.nextInt();
		if(y%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}