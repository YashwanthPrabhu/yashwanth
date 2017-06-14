import java.util.Scanner;

public class HeightOf50 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the height of 50 students");
		int[] arr=new int[50];
		for(int i=0;i<50;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<50;i++)
		{
			for(int j=i+1;j<50;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("4th tallest student : "+arr[50-4]);
		System.out.println("Enter the position : ");
		int pos=in.nextInt();
		System.out.println("The "+pos+"th tallest height is "+arr[50-pos]);
		}
}
