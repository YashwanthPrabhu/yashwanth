import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class RemovingDupe {
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);	
	    System.out.println("Enter a word");
	    String str=in.next();
	    int len=str.length();
	    HashSet<Character> hs=new HashSet<Character>();
	    for(int i=0;i<len;i++)
	    {
	    	hs.add(str.charAt(i));
	    }
	    Iterator<Character> itr=hs.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next());
	    }
	}
}
