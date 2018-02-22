def toPrint(a):
    return''.join(a)

def permute(a,l,r):
    if(l==r):
        print(toPrint(a))
    else:    
        for i in range (l,r+1): #initially hour is 0 and l is 0
            a[i],a[l] = a[l],a[i]
            permute(a,l+1,r)
            a[i],a[l] = a[l],a[i]

a = list('asdfghjklqwertyuiopzxcvbnm')
n = len(a)
permute(a,0,n-1)
