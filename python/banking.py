balance=float(input("enter your balance:"))
amount=float(input("enter your amount:"))
acc_typ=input("enter your account type:").lower()
tran_typ=input("enter your transaction type:").lower()

if amount < 0:
    print('cannot be processed')

elif tran_typ=='deposit':
    balance=balance+amount
    print("your balance is",balance)

elif tran_typ=='withdraw' :
    
    if balance < amount:
        print("insufficient funds")

    elif tran_typ=="savings" and balance-amount<=1000:
        print("insufficient funds")

    elif tran_typ=='current' and balance-amount<=0:
        print("insufficient funds")

    else:
        balance=balance-amount
        print("withdraw sucessful your balance is ", balance )

else:
    print("invalid command")