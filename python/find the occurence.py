num=[50,60,10,60,10,10,80]
lis=[]
for i in range(len(num)):
    if num[i]==10:
        lis.append(i)

print(lis)
