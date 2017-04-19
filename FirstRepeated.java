import java.util.Scanner;
class FirstRepeated
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of the array");
int size=input.nextInt();
int arr[]=new int[size];
int count=0;
System.out.println("Enter "+size+" elements");
for(int i=0;i<size;i++)
{
arr[i]=input.nextInt();
}
for(int j=0;j<size;j++)
{
for(int k=j+1;k<size;k++)
{
if(arr[j]==arr[k])
{
System.out.println(arr[j]);
count=1;
break;
}
}
if(count==1)
{
break;
}
}
}
}