#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

long long product(long long n){
    long long p  = 1;
    while(n){
        p *= (n % 10);
        if (p == 0)
            return 0;
        n /= 10;
    }
    return p;
}

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        int k; 
        scanf("%d %d",&n,&k);
        char* num = (char *)malloc((n + 1) * sizeof(char));
        scanf("%s",num);
        
        long long largest = 0;
        for(int i = 0;i < n - k;i++){
            char* p = calloc(k + 1, sizeof(char));
            strncpy(p, num + i, k);
            long long a;
            sscanf(p, "%lld", &a);
            long long producto = product(a);
            if(producto > largest)
                largest = producto;
        }
        
        printf("%lld\n", largest);
    }
    return 0;
}
