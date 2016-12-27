import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumSquareDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long sum = 0;
            long sqrSum = 0;
            for(int i = 1;i <= n; i++){
                sum += i;
                sqrSum += (long) Math.pow(i,2);
            }
            
            sum = (long) Math.pow(sum,2);
            sum -= sqrSum;
            
            System.out.println(sum);
        }
    }
}
