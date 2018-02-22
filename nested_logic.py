ad,am,ay = map(int,input().split(' '))
ed,em,ey = map(int,input().split(' '))
fine = 0
if(ay>ey):
    print(10000)
elif(ay==ey):
    if(am>em):
        print((am-em)*500)
    elif(am==em):
        if(ad>ed):
            print((ad-ed)*15)
        else:
            print(0)
    else:
        print(0)
else:
    print(0)
"""
print(a[0])
print(isinstance(int(a[0]),int))
"""
