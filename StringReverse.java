import java.util.Scanner;
class StringReverse
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Entre a String");
String s1=input.next();
StringBuffer s2=new StringBuffer(s1);
StringBuffer s3=s2.reverse();
System.out.println(s3);
}
}