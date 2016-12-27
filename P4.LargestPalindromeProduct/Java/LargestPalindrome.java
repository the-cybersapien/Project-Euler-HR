import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int max = 0;
            
            for(int i = 100;i < 1000; i++){
                for(int j = 100;j < 1000; j++){
                    int product = i * j;
                    if((product < n) && isPalindrome(product) && (max < product))
                        max = product;
                }
            }
            
            System.out.println(max);
        }
    }
    
    private static boolean isPalindrome(int n){
        
        int rev = 0;
        int num = n;
        
        while(num != 0){
            rev *= 10;
            rev += num%10;
            num /= 10;
        }
        
        if(rev == n){
            return true;
        }
        return false;
    }
}
