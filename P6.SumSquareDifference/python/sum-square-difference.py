#!/bin/python

import sys

import math

## Python being amazingly slow gave me the idea to find a non-loop solution :D
t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6
    squareOfSum = math.pow((n * (n + 1)) / 2, 2)
    
    print int(squareOfSum - sumOfSquares)
