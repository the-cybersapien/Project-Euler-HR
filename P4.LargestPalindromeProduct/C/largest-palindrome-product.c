#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int palindrome(int n){
    
    int reverse = 0;
    int num = n;
    while(n){
        reverse = (reverse * 10) + (n % 10);
        n /= 10;
    }
    if(reverse == num)
        return 1;
    return 0;
}

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        scanf("%d",&n);
        
        int max = 0;
        for(int i = 100;i<1000;i++){
            for(int j = 100;j < 1000; j++){
                int product = i * j;
                if((product < n) && palindrome(product) && (max < product))
                    max = product;
            }
        }
        
        printf("%d\n", max);
    }
    return 0;
}
