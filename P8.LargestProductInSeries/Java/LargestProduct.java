import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            
            long largest = 0;

            for (int i = 0; i < n - k; i++) {
                String p = num.substring(i, i + k);
                long product = product(Long.valueOf(p));
                if (product > largest)
                    largest = product;
            }

            System.out.println(largest);
        }
    }

    private static long product(long n){
        long p = 1;
        while(n != 0){
            p *= (n % 10);
            if (p == 0)
                return 0;
            n /= 10;
        }
        return p;
    }
}
