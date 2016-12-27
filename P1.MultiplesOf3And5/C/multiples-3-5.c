#include <stdio.h>

int main(int argc, char const *argv[])
{
	int t; // Number of Test Cases
	scanf("%d", &t);

	for (int i = 0; i < t; ++i)
	{
		long long n; // Number to check
		scanf("%lld", &n);

		long long sum = 0; // Initialize the sum to zero

        // Using Arithmetic Progression
        // find the sum of all terms that are
        // multiples of 3, 5 and 15.
		long long x3 = 3 * ((n - 1) / 3) * (((n - 1) / 3) + 1) / 2;
		long long x5 = 5 * ((n - 1) / 5) * (((n - 1) / 5) + 1) / 2;
		long long x15 = 15 * ((n - 1) / 15) * (((n - 1) / 15) + 1) / 2;

		// Since we need to add all which are multiples of either 3 or 5
        // we add x3 and x5. 
        // But now, those which multiples of 15 are repeated twice
        // so we subtract them once.
		sum = x3 + x5 - x15;

		printf("%lld\n", sum);
	}
	
	return 0;
}