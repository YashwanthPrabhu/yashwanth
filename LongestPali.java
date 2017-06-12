import java.util.Scanner;

public class LongestPali {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=in.next();
		String sub;
		int a=0;
		String s = null;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					sub=str.substring(i,j+1);
					StringBuffer sb=new StringBuffer(sub);
					StringBuffer s2=sb.reverse();
					String ss=new String(s2);
					if(sub.equals(ss))
					{
						int l1=sub.length();
						if(l1>a)
						{
							s=sub;
							a=l1;
						}
					}
					
					
				}
			}
		}
		System.out.println(s);
	}

}
