#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        scanf("%d",&n);
        long long sum = 0;
        long long sqrSum = 0;
        
        for(int i = 1;i <= n; i++){
            sum += i;
            sqrSum += pow(i, 2);
        }
        
        sum = pow(sum, 2);
        sum -= sqrSum;
        
        printf("%lld\n", sum);
    }
    return 0;
}