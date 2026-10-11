# A list contains distinct numbers from 1 to n, but exactly one number is missing. Find the missing number without sorting the list.
# First, solve the problem using a loop and the sum formula. If you know the XOR operator, try an alternative solution.


def missing_sum(numbers, n):
    expected = n * (n + 1) // 2
    actual = 0
    for x in numbers:
        actual += x
    return expected - actual

print(missing_sum([1, 2, 4, 6, 3, 7, 8], 8))  
print(missing_sum([2, 3, 4, 5], 5))           