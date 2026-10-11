#Write a Python program to find the maximum number of consecutive occurrences of the same value in a list.

def longest_run(numbers):
    if not numbers:
        return 0
    best = current = 1
    for i in range(1, len(numbers)):
        
        if numbers[i] == numbers[i - 1]:
            current += 1

        else:
            current = 1

        if current > best:
            best = current

    return best

print(longest_run([1, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1])) 
print(longest_run([7, 7, 7, 7]))                        