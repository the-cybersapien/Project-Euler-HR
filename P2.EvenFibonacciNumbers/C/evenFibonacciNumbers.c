#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t; // Total test cases
    scanf("%d",&t);

    for(int a0 = 0; a0 < t; a0++){
        long n; 
        scanf("%ld",&n);
        long long sum = 0;

        // Every third term of the Fibonacci Series is Even
        // Any Even term, E(n) = 4 * E(n - 1) + E(n - 2)
        // performing the same math here in a loop
        long long f0 = 2, f1 = 8, f2 = 0;
        
        sum += f0;

        while(f1 <= n){
            sum += f1;
            f2 = (4 * f1) + f0;
            f0 = f1;
            f1 = f2;
        }
        
        printf("%lld\n" , sum);
    }

    return 0;
}
