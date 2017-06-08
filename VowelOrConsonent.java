import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Character");
		char c=in.next().charAt(0);
		char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		for(int i=0;i<10;i++)
		{
			if(c==vowel[i])
			{
				count++;
			}
		}
		System.out.println((count>0)?"Vowel":"Consonent");
	}

}