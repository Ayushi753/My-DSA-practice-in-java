package Pattern;

import java.util.Scanner;

public class RoughPatter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        //1.
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        //2.
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        //3.
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
