#Q7. ATM Withdrawal Analysis
#Process 10 withdrawal requests. Validate the amount, check whether it is a multiple of ₹500, enforce a maximum withdrawal limit of ₹20,000, and count successful and rejected transactions.
succ=0
rej=0
for i in range(10):
    req=int(input("enter withdrawl amount : "))
    if req<20000:
        succ=succ+1
        if req%500==0:
            print("withdrawl amount is multiple of 500 ")

        else:
            print("withdrawl amount is not multiple of 500 ")
        print("transfer succesful")

    else:
        rej=rej+1
        print ("transfer rejected\n withdrawl limit is 20000")

print("rejected transfers are",rej)
print("sucessful transfers are",succ)