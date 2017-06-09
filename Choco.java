public class Choco {
	public static void main(String args[])
	{
	int len=args.length;
	if(len>0)
	{
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<len;i++)
		{
				int a=arr[i]/10;
				int b=arr[i]%10;
				System.out.println((a+b-2));
		}
	}
	else
	{
		System.out.println("Please enter the values as commmand line arguements");
	}
	}
}
