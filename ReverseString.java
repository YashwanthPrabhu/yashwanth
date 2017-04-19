import java.util.Scanner;
class ReverseString
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a String");
String str=input.nextLine();
int len=str.length();
String s[]=new String[100];
int a=0;
int b,z=0;
for(int i=0;i<len;i++)
{
if(str.charAt(i)==' '||i==len-1)
{
b=i+1;
s[z]=str.substring(a,b);
a=b;
z++;
}
}
for(int q=z-1;q>=0;q--)
{
System.out.print(s[q]+" ");
}
}
}