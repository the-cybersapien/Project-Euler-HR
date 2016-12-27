#!/bin/python

import sys

primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]

def getDiv(i , n):
    rVal = 1
    while rVal * primes[i] <= n:
        rVal *= primes[i]
    return rVal

t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    m = 1
    
    for i in xrange(len(primes)):
        m *= getDiv(i, n)
        
    print m
    