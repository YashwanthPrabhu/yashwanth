public class NonRepeated1 { 
	public static void main(String[] args)
	{
		int len=args.length;
		if(len==0)
		{
			System.out.println("Please enter the values as command line arguements");
		}
		else
		{
			int count=0;
			int arr[]=new int[len];
			for(int i=0;i<len;i++)
			{
				arr[i]=Integer.parseInt(args[i]);
			}
					for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(arr[i]);
					break;
				}
				count=0;
			}
		}
	}

}
