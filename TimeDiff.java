import java.util.*;
public class TimeDiff {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter time1");
		int h1=in.nextInt();
		int m1=in.nextInt();
		int h,m;
		System.out.println("Enter time2");
		int h2=in.nextInt();
		int m2=in.nextInt();
		if(h1>h2)
		{
			if(m1>=m2)
			{
			   h=h1-h2;
			   m=m1-m2;
			}
			else
			{
				h=(h1-1)-h2;
				m=(m1+60)-m2;
			}
		}
		else
		{
			if(m2>=m1)
			{
				h=h2-h1;
				m=m2-m1;
			}
			else
			{
				h=(h2-1)-h1;
				m=(m2+60)-m1;
			}
		}
		System.out.println(h+":"+m+" hours");
	}

}
