#Write a Python program to find the second-largest distinct number in a list


#numbers=[12, 35, 1, 10, 34, 35]
#numbers=[5, 5, 5, 4]
#numbers=[10, 10, 10]
numbers=[-5, -2, -10, -1]


lar_num=float('-inf')
sec_num=float('-inf')

for i in numbers:
    if i>lar_num:
        sec_num=lar_num
        lar_num=i

    elif i>sec_num and i!=lar_num:
        sec_num=i

if sec_num==float('-inf'):
    print("No second-largest distinct value")
else:                 
    print("second largest number is",sec_num)        