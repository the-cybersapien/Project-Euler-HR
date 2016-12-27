import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // Total test cases
        for (int i = 0; i<t;i++){
            long n = in.nextLong();
            long sum = 0;
            // Every third term of the Fibonacci Series is Even
            // Any Even term, E(n) = 4 * E(n - 1) + E(n - 2)
            // performing the same math here in a loop
            long f0 = 2, f1= 8, f2 = 0;
            sum += f0;
            while (f1 <= n){
                sum += f1;
                f2 = (4*f1) + f0;
                f0 = f1;
                f1 = f2;
            }
            
            System.out.println(sum);
        }
    }
}