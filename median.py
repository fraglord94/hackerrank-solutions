def randomized_select(A,p,r,i):
    if p == r:
        return A[p]
    q = randomized_partition(A,p,r)
    k = q - p + 1
    if (i==k):
        return A[q]
    elif(i<k):
        return randomized_select(A,p,q-1,i)
    else:
        return randomized_select(A,q+1,r,i-k)

def randomized_partition(A,p,r):
    from random import randint
    return(randint(p,r))

A = [4,1,6,8,3,5,9,2]
print(randomized_select(A,0,8,5))
