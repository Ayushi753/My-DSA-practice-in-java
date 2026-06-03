package Pattern;

import java.util.*;

public class AlphaNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alphacounter = 1, numcounter = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print((char) (64 + alphacounter) + ",");
                alphacounter++;
            } else {
                System.out.print(numcounter + ",");
                numcounter++;

            }
        }
    }

}
