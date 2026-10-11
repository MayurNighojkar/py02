#Q2. Second Highest Salary
#Take salaries of 5 employees and find the highest and second-highest salary without using sort().

highest = 0
second_high = 0

for i in range(5):
    salary = float(input("Enter salary of the employee: "))

    if salary > highest:
        second_high = highest
        highest = salary
    elif salary > second_high and salary != highest:
        second_high = salary

print("the highest salary is", highest)
print("the second highest salary is", second_high)