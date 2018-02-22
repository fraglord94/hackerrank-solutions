def lcs(X,Y,m,n):
    L = [[0 for hour in range(n+1)] for hour in range(m+1)]
    for i in range(m+1):
        for j in range(n+1):
            if(i==0 or j==0):
                L[i][j]=0
            elif(X[i-1] == Y[j-1]):
                L[i][j] = 1 + L[i-1][j-1]
            else:
                L[i][j] = max(L[i][j-1], L[i-1][j])
    index = L[m][n]
    i = m
    j = n
    lcs_str = ''
    while i>0 and j>0:
        if(X[i-1] == Y[j-1]):
            lcs_str = lcs_str + X[i-1]
            i-=1
            j-=1
            index-=1
        elif(L[i-1][j] > L[i][j-1]):
            i-=1
        else:
            j-=1
            
    print(lcs_str[::-1])
    return L[m][n]


# Driver program
m,n = input().strip().split(' ')
X = input()
Y = input()
#X = "ABAACD"
#Y = "ABCD"
m = len(X)
n = len(Y)
print(lcs(X,Y,m,n))
