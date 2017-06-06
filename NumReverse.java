import java.util.Scanner;

public class NumReverse {
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);	
     System.out.println("Enter a number");
     int num=in.nextInt();
     for(;num>0;num/=10)
     {
    	 int c=num%10;
    	 System.out.print(c);
     }
  }
}
