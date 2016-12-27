import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long i;
            long prime = 0;
            
            // Start by checking if the n is even or not
            // If n is even, divide it by 2,
            // until it is no longer even.
            if(n % 2 == 0){
                prime = 2;
                
                while (n % 2 == 0){
                    n = n / 2;
                }

            }
            
            // Check against the odd numbers starting from 3.
            // If n is divisible by i, divide n by i
            // until n is no longer divisible by i
            for (i = 3;i <= Math.sqrt(n);i += 2){
                
                while(n % i == 0){
                    // if i is greater than prime,
                    // put the value of i in prime
                    if(i > prime)
                        prime = i;
                    n = n / i;
                }
                
            }
            
            // In case the number itself is prime,
            // we want that number itself as the answer
            if (n > 2 && n > prime)
                prime = n;
            
            System.out.println(prime);
        }
    }
}
