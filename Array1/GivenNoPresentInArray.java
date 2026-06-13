package Array1;
import java.util.*;
class GivenNoPresentInArray
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 5 number");
        int a[]=new int [5];
        for(int x=0; x<5; x++)
        {
            a[x]=sc.nextInt();
        }
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int flag=0;
        int sum=0;
        for( int x=0; x<5; x++)
        {
            if (a[x]==n)
            {
              
              sum=sum +1;
            }
        }
        System.out.println("Number is present number of times=" +sum);

    }  
}



