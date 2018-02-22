n =int(input())
d = dict(input().split() for _ in range(n))
for _ in d:
    str_1 = str(input())
    if(str_1 in d):
        print(str_1+"="+d[str_1])
    else:
        print('Not found')
        
    
