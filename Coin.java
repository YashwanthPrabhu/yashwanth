import java.util.Scanner;

public class Coin {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter total value");
		int val=in.nextInt();
		int five=0;
		int three=0;
		int one=0;
		for(;val>0;)
		{
			if(val>=5)
			{
				val=val-5;
				five++;
				continue;
			}
			else if(val>=3)
			{
				val=val-3;
				three++;
				continue;
			}
			else if(val>=1)
			{
				val=val-1;
				one++;
			}
		}
		System.out.println("Five rupee coin : "+five+"\nThree rupee coin : "+three+"\nOne rupee coin : "+one);
	}

}
