package Array1;
import java.util.*;
class EvenInArray
{
    public static void main(String args[])
    {
        System.out .println("Enter any 5 no");
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];  //declare the size5

        //Read the data
        
        System.out.println("Enter any 5 number");
        for(int x=0;x<5;x++)
        {
            a[x]=sc.nextInt();
        }
        //Search the data
        int x=sc.nextInt();
        for (x=0 ; x<5 ; x++)
        
        {
         if (a[x]%2==0)
         {
            System.out.println(a[x]+"Number is even");
         }
         else
         {
            System.out.println(a[x]+"Number is odd");
         }
        }

    }
}
