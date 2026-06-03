package Pattern;

import java.util.*;

public class Tribhuj {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }

        /*
         * A
         * AB
         * ABC
         * ABCD
         * ABCDE
         */

        // 2

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // alphabets
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }

            System.out.println();
        }

        /*
         * ABCDE
         * ABCD
         * ABC
         * AB
         * A
         */

        // 3

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + "");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + "");
            }
            System.out.println();
        }

        /*
         * " A
         * AB
         * ABC
         * ABCD
         * ABCDE
         * ABCD
         * ABC
         * AB
         * A "
         */

        // 4

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) (64 + j) + "");
            }
            System.out.println();
        }

        // 5
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing part
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }

            // decreasing part
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (64 + j));
            }

            System.out.println();
        }

    }

}