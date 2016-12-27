#!/bin/python

import sys

t = int(raw_input().strip())

for a in range(0, t):
    n = long(raw_input().strip())
    f0 = 2
    f1 = 8
    f2 = 0
    sum = f0
    while f1 <= n:
        sum += f1
        f2 = (4 * f1) + f0
        f0 = f1
        f1 = f2
        pass
    print sum
    pass
