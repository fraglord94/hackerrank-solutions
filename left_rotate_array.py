n, r = input().strip().split(' ' )
r = int(r)
arr = input().strip().split(' ')
arr1 = arr[r:]+arr[:r]
print(' '.join(arr1))
