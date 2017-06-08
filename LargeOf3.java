import java.util.Scanner;

public class LargeOf3 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three nnumbers");
		int[] a=new int[3];
		int big=0;
		for(int i=0;i<3;i++)
		{
			a[i]=in.nextInt();
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}

}
