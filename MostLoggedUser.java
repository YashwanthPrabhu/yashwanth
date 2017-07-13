package myPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MostLoggedUser 
{
    @SuppressWarnings({ "rawtypes", "resource"})
	public static void main(String args[])
    {
    	HashMap<String,Integer> hm=new HashMap<String, Integer>();
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the total number of entries");
    	int tot=in.nextInt();
    	System.out.println("Enter the user names");
    	for(int i=0;i<tot;i++)
    	{
    		String s=in.next();
    		if(hm.containsKey(s))
    		{
    			int val=hm.get(s);
    			val+=1;
    			hm.put(s,val);
    		}
    		else
    		{
    			hm.put(s,1);
    		}
    	}
    	Set set=hm.entrySet();
    	Iterator itr=set.iterator();
    	while(itr.hasNext())
    	{
    		Map.Entry mp=(Entry) itr.next();
    		System.out.println(mp.getKey()+" "+mp.getValue());
    	}
    }
}
