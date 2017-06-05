import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int count=0;
	    int flag=0;
	    System.out.println("Enter a string");
	    String str=input.next();
	    int len=str.length();
	    for(int i=0;i<len;i++)
	    {
	    	if(str.charAt(i)>=65&&str.charAt(i)<=90)
	    	{
	    		count++;
	    	}
	    	if(str.charAt(i)>=97&&str.charAt(i)<=122)
	    	{
	    		flag=1;
	    	}
	    }
	    if(flag==1&&count>1)
	    {
	    	System.out.println("CamelCase");
	    }
	    else
	    {
	    	System.out.println("Not a CamelCase");
	    }
	}

}
