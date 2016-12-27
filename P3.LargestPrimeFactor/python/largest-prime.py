#!/bin/python

import sys
import math

t = int(raw_input().strip())
for a0 in xrange(t):
    n = long(raw_input().strip())
    i = 2
    prime = 0
    while i * i <= n:
        while n % i == 0:
            prime = i
            n /= i
        if i == 2:
            i += 1
        else:
            i += 2

    if n > 2:
        if n > prime:
            prime = n
    print prime
