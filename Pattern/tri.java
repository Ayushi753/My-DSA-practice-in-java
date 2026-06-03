package Pattern;
import java.util.*;
class tri {
    public void pattern14(int n) {
     
     for(int i = 1; i <= n; i++) 
        {

            int start = n - i + 1;

            for(int j = start; j <= n; j++) {

                System.out.print((char)(64 + j));
            }

            System.out.println();
        }
    }
}


