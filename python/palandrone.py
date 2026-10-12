num=int(input("enter a number "))
rev=0
pan=num

while num !=0:
    digit=num%10
    rev=(rev*10)+digit
    num=num//10

if pan==rev:
    print ("number is palandrone")

else:
    print("number is not palandrone")