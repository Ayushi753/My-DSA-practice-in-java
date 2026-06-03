package Pattern;
import java.util.*; 
class Unique
{
    public static void main(String args[])
    {
        int n = 10;
        int a = 1;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + ",");

            if(a == 1)
            {
                a = 0;
            }
            else
            {
                a = 1;
            }
        }
    }
}