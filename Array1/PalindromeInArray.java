import java.util.*;
class PalindromeInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[5];    //declare the size5
        for (int x=0 ;x<a.length ;x++)
        {
         System.out.println("Enter any 5 number");
            a[x]=sc.nextInt();
        {
         // Read the number 
         for (int x=0; x<a.length; x++)
         {
            int flag=0;
         int n=a[x];
         int a=0;
         int c=0;
         int p=n;
         {
            a=n%10;
            c=c*10+a;
            n=n/10;
         }
        
         if (c==p)
         {
            flag=1;
            break;
         }
         if (flag==0)
            System.out.println(c+"is palindrome");
        }

        }
      
    }

    
}