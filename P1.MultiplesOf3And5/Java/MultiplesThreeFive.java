import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultiplesThreeFive {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner in = new Scanner(System.in);

        //Get the total number of test cases
        int t = in.nextInt();

        for (int i = 0; i<t;i++){
            // Get the number N
            long n = in.nextInt();
            // Initialize the sum to 0
            long sum = 0;

            // Using Arithmetic Progression
            // find the sum of all terms that are
            // multiples of 3, 5 and 15.
            long x3 = 3*((n-1)/3)*(((n-1)/3)+1)/2;
            long x5 = 5*((n-1)/5)*(((n-1)/5)+1)/2;
            long x15 =15*((n-1)/15)*(((n-1)/15)+1)/2;

            // Since we need to add all which are multiples of either 3 or 5
            // we add x3 and x5. 
            // But now, those which multiples of 15 are repeated twice
            // so we subtract them once.
            sum = x3+x5-x15;
            System.out.println(sum);
        }
    }
}