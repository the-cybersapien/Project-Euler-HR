#!/bin/python

import sys
from bisect import bisect_left as biLeft
## Ah the fun of scripting languages, we can do this with much ease

arr = []
for i in range(999, 100, -1):
    for j in range(999, 100, -1):
        product = str(i*j)
        if product == product[::-1]:
            arr.append(i*j)
            
arr.sort()
## Using Binary Search, we choose the element right before the number n
for _ in range(int(raw_input())):
    print arr[biLeft(arr, int(raw_input())) - 1]
