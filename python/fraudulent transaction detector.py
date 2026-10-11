#Q5. Fraudulent Transaction Detector
#Process 8 transactions. Consider transactions above ₹1,00,000 as suspicious. Count suspicious transactions and calculate their total value.
sus_amount=0
sus_tran=0
for i in range (1,9):
    tran=float(input("enter transaction "+str(i)+" amount:"))

    if tran>=200000:
        sus_amount=sus_amount+1
        sus_tran=sus_tran+tran

print(sus_amount,"suspicious transfer happened")
print("total suspicious transfered amount is ",sus_tran)
