#Write a Python program to move all zeros to the end of a list while preserving the relative order of the non-zero elements.
#First, solve the problem using a new list. Then solve it by modifying the original list.

numbers = [0, 1, 0, 3, 12, 0, 5]
num=[]
zero=0
for i in numbers:
    if i!=0:
        num.append(i)

    else:
        zero+=1

num+=[0]*zero
print(num)

#modified

n_num = 0 

for i in range(len(numbers)):
    if numbers[i] != 0:
        numbers[n_num] = numbers[i]
        n_num += 1

for i in range(n_num, len(numbers)):
    numbers[i] = 0

print(numbers) 