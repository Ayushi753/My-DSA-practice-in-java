package Pattern;
import java.util.*;
public class Butterfly 
{
     public static void main(String args[])
     {
         Scanner sc= new Scanner(System.in);
          int n= sc.nextInt();
          
          int a=2*5-3;
          for(int i=1; i<=4;i++)
          {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=a; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            a=a-2;
            System.out.println();
          }
       
          // for straight line
          for( int i=1; i<=2*5-1; i++)
          {
            System.out.print("*");
          }
           System.out.println();   

        // for lower half
        a=1;
        for(int i=4;i>=1; i--)
          {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=a; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            a=a+2;
            System.out.println();
          }
          

     }
}
