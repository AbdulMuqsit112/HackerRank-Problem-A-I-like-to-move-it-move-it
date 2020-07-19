def movee(ps,mvs,n):
    row = int(ps/n)
    col=int(ps%n)
    for char in mvs:
        p = char
        if p==0:
            row=row-1
        elif p==1:
            row=row-1
            col=col+1
        elif p==2:
            col=col+1
        elif p==3:
            row=row+1
            col=col+1
        elif p==4:
            row=row+1
        elif p==5:
            row =row+1
            col =col-1
        elif p==6:
            col=col-1
        elif p==7:
            row=row-1
            col =col-1
        else:
            return 0
        if col==n:
            col=0
        elif col==-1:
             col = n-1
        if row==n:
            row=row-1
        elif row==-1:
            row=0
    pos =row*n
    pos+=col
    return pos

no =int(input())
arr =[0,]
for i in range(0,no):
    n=int(input())
    pos=int(input())
    movess=input()
    mvs=movess.split()
    mvs=[int(k) for k in mvs]
    if i==0:
        arr[0]=movee(pos,mvs,n)
    else:
        arr.append(movee(pos,mvs,n))

for j in range(0,no):
    print(f'Case{j+1}: {arr[j]}')
