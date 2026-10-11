#Q6. Employee Performance Analyzer
#process the performance scores of 6 employees. Categorize them as Excellent, Good, Average, or Poor. Also find the highest and lowest scores.
h_s=0
l_S=100

for i in range(1,7):
    score=(int(input("enter performence score of empolyee "+str(i)+": ")))
    
    if score>=90:
        print("excellent score")

    elif score>=80:
        print("good score")

    elif score>=60:
        print("average score")

    else:
        print("poor score")
 
    if score>=h_s:
        h_s=score

    if score<=l_S:
        l_S=score

print("the highest score is" ,h_s)
print("the lowest score is" ,l_S)