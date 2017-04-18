import java.util.Scanner;
class CountDigit
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enetr a number");
int num=input.nextInt();
int flag=0;
if(num==0)
{
System.out.println("Number of Digit : 1");
}
else
{
for(;num>0;num/=10)
{
flag++;
}
System.out.println("Number of Digits : "+flag);
}
}
}