#!/bin/python

import sys

def product(n):
    p = 1
    while n != 0:
        p *= n % 10
        if p == 0:
            return 0
        n /= 10
    return p


t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    num = raw_input().strip()
    largest = 0
    for i in xrange(n-k):
        p = product(long(num[i:i + k]))
        if (p > largest):
            largest = p
            
    print largest