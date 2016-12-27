import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * We need a number divisible by all primes < N, So for a number M,
 * M is divisible by all numbers from 1 to N iff M is equal to the product
 * of all prime powers p^k where p is prime and divides M, and p < N, and k 
 * is the largest integer such that p^k < N. For example, 2520 = 2^3 * 3^2 * 5 * 7
 */
 
public class SmallestMultiple {

	// I wrote all the primes between 1 and 40
	// makes work easier for us
    private static long[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a = 0; a < t; a++) {
            int n = in.nextInt();

            long multiple = 1L;

            for (int i = 0; i < primes.length; i++){
                multiple *= getDiv(i, n);
            }
            System.out.println(multiple);
        }
    }

	// get max p[i]^k < n
    private static long getDiv(int i, int n){
        long rVal = 1L;
        while (rVal * primes[i] <= n){
            rVal *= primes[i];
        }
        return rVal;
    }
}
