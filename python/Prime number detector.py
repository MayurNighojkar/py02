#Q8. Prime Number Detector
#Print all prime numbers between 1 and 50.
for i in range(1,101):
    fac=0
    for j in range(1,i+1):
        if i%j==0:
            fac=fac+1
    if fac==2:
        print(i) 