num=[10,20,30,40,50,60,70]
print(num)

rev=[]

for i in range(len(num)-1,-1,-1):
    rev.append(num[i])
print(rev)



rev1=[]
for i in range(len(num)):
    rev1.insert(0,num[i])
print (rev1)




num.reverse()
print(num)



num.sort(reverse=True)
print(num)



