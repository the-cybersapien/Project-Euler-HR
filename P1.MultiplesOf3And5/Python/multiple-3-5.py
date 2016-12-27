#!/bin/python

import sys

t = int(raw_input().strip())

for a in range(0,t):
    n = long(raw_input().strip())

    sum = 3 * ((n - 1) / 3) * (((n - 1) / 3) + 1) / 2;
    sum += 5 * ((n - 1) / 5) * (((n - 1) / 5) + 1) / 2;
    sum -= 15 * ((n - 1) / 15) * (((n - 1) / 15) + 1) / 2;
    
    print sum
    pass
