package Pattern;

import java.util.*;

public class hollow_kajjukatli 
{
    public static void main(String args[])
     {
        int a = 1;

        // for straght line
        for (int i = 1; i <= 2 * 5 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // for upper half
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            a = a + 2;
            System.out.println();
        }

        // for lower half

        a = a - 4;
        for (int i = 2;i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            a = a - 2;
            System.out.println();
        }

        // for straght line
        for (int i = 1; i <= 2 * 5 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
