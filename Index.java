public class Index {

	public static void main(String[] args) {
	    int len=args.length;
	    if(len==0)
	    {
	    	System.out.println("Please enter the values as arguements");
	    }
	    else
	    {
	    	int temp;
	    	int[] arr=new int[len];
	    	for(int i=0;i<len;i++)
	    	{
	    		arr[i]=Integer.parseInt(args[i]);
	    	}
	    	for(int i=0;i<len;i++)
	    	{
	    		for(int j=i+1;j<len;j++)
	    		{
	    			if(arr[i]>arr[j])
	    			{
	    				temp=arr[i];
	    				arr[i]=arr[j];
	    				arr[j]=temp;
	    			}
	    		}
	    	}
	    	for(int i=0;i<len;i++)
	    	{
	    		if(arr[i]==i)
	    		{
	    			System.out.println(i);
	    		}
	    	} 
	    }

	}

}
