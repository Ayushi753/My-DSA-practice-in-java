package Array1;
import java .util.*;
public class PositiveSumInArray 
{
  public static void main(String args[])  
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int [5];  //declare the size5
     
    //Read the data given in code.
    System.out.println("Enter any 5 number");
    for(int x=0; x<5; x++)
    {
        a[x]=sc.nextInt();
    }
    // Search the data
    int sum=0;
    for(int x=0; x<5;x++)
    {
        if (a[x]>0)
        {
           sum=sum+a[x] ;
        }
            System.out.println("sum ="+sum);
        
    }
  }
}
