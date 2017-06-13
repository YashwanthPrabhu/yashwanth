import java.util.Scanner;

public class Elephant {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int tot=in.nextInt();
		int capacity=in.nextInt();
		System.out.print("");
		int[] weight=new int[tot];
		int temp;
		int count=0;
		for(int i=0;i<tot;i++)
		{
			weight[i]=in.nextInt();
		}
		for(int i=0;i<tot;i++)
		{
			for(int j=i+1;j<tot;j++)
			{
				if(weight[i]>weight[j])
				{
					temp=weight[i];
					weight[i]=weight[j];
					weight[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<tot;i++)
		{
			sum+=weight[i];
			if(sum<=capacity)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
