import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int num=input.nextInt();
int fact=1;
for(int i=num;i>0;i--)
{
fact*=i;
}
System.out.println("Factorial of a given number is "+fact);
}
}