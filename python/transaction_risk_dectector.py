#Q3. Customer Transaction Risk Detector
#Process 10 transaction amounts and classify each transaction as Low, Medium, or High Risk. Count transactions in each category.


low = 0
medium = 0
high = 0

for i in range(1, 11):
    amount = float(input("Enter transaction amount " + str(i) + ": "))

    if amount < 10000:
        print("Low Risk")
        low = low + 1

    elif amount <= 50000:
        print("Medium Risk")
        medium = medium + 1

    else:
        print("High Risk")
        high = high + 1

print("Low Risk Transactions:", low)
print("Medium Risk Transactions:", medium)
print("High Risk Transactions:", high)