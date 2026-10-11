age=int(input("enter your age: "))
monthly_income=int(input("enter your income: "))
credit_score=int(input("enter your credit score: "))
existing_loan=int(input("how much loan do you have?"))
employment_years=int(input("enter your employment years: "))

if age<21:
    print("SORRY you are underage !!!")
    
elif monthly_income<30000:
    print("SORRY your income is very low ")
    
elif credit_score<700:
    print("SORRY your credit score is low")
    
elif employment_years<2:
    print("your employment years are not enough")
    
elif existing_loan>200000:
    print ("your loan is rejected")
    

elif existing_loan<200000 and existing_loan>0:
    print("additional verification is required")
    
else:
    if credit_score>=750:
        print("your loan is approved and you will get low interest loan")
        
    elif credit_score<750:
        print("your loan is approved and you will get normal interest loan")
        
    elif credit_score<700:
            print("your loan is rejected")
            
    else:
        print("command is invalid")
        print