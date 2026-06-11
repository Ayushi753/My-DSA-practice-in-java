package Array1;
import java.util.*;
class Biggest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        for(int x=0; x<5;x++)
        {
            System.out.println("Enter any number");
            a[x]=sc.nextInt();
        }
        int max=a[0];
        for(int x=1; x<5 ;x++)
        {
            if (a[x]>max)
            {
               max=a[x];
            }
        }
        System.out.println("Biggest no=" +max);
    }
}
