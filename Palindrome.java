class Palindrome
{
public static void main(String args[])
{
StringBuffer s1= new StringBuffer(args[0]);
StringBuffer s2=s1.reverse();
String s3=s2.toString();
System.out.println((args[0].equals(s3))?"Palindrome":"Not a Palindrome");
}
}