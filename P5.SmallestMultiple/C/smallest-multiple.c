#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

/**
 * We need a number divisible by all primes < N, So for a number M,
 * M is divisible by all numbers from 1 to N iff M is equal to the product
 * of all prime powers p^k where p is prime and divides M, and p < N, and k 
 * is the largest integer such that p^k < N. For example, 2520 = 2^3 * 3^2 * 5 * 7
 */

// I wrote all the primes between 1 and 40
// makes work easier for us
int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

// get max p[i]^k < n
long long getDiv(int i, int n){
	long long rVal = 1;
	while (rVal * primes[i] <= n){
		rVal *= primes[i];
	}
	return rVal;
}

int main(){
	int t, n;
	scanf("%d", &t);
	while (t--){
		
		scanf("%d", &n);
		
		long long m = 1;
		
		for(int i = 0; i < 12; i++){
			m *= getDiv(i, n);
		}
		
		printf("%lld\n", m);
	}
}
