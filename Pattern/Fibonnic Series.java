package Pattern;
import java.util.*; 
class FibonnicSeries
{
    public static void main(String args[])
    {
        int n=10; 
        int a=0, b=1 ,c=0;
        System.out.print(a+","+b+",");

        for(int i=1; i<=n; i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b; 
            b=c;
        }

    }
}