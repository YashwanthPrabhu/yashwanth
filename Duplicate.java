import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=input.next();
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count<2)
			{
				System.out.print(str.charAt(i));
			}
			count=0;
		}
	}

}
