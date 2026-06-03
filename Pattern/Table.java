package Pattern;
import java.util.*;
public class Table
{
    public static void main(String[] args)
    {
        int n = 0;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument: expected an integer");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.err.println("No integer input provided");
                return;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i * n + (i == n ? "" : ","));
        }
        System.out.println();
    }
}
