#!/bin/python3
import sys


n = int(input().strip())
s = input().strip()
k = int(input().strip())
for hour in s:
    c = ord(hour)
    #upper case
    if(c>=65 and c<=90):
        print(chr(65 + (c+k-65)%26),end='')
    elif(c>=97and c<=122):
        print(chr(97 + (c+k-97)%26),end='')
    else:
        print(hour,end='')
