import java.util.Scanner;

public class Comparsion 
{
public static void main( String args[] )
{
    Scanner input = new Scanner( System.in );
   int num1;
   int num2;
   
  System.out.print("enter first integer: ");
  num1 = input.nextInt();
  
  
  System.out.print("enter second integer:");
  num2 = input.nextInt();
  
  
  if ( num1 == num2 )
      System.out.printf("%d ==%d\n", num1, num2 );
  else {
  System.out.println("Both Numbers are not equal");
  
  }

 
  if  (num1 != num2 )
      System.out.printf("%d != %d\n", num1,num2);
  if  (num1 < num2)
      System.out.printf("%d < %d\n" , num1,num2);
  if (num1 > num2 )
      System.out.printf("%d > %d\n" , num1,num2);
    
}
}
