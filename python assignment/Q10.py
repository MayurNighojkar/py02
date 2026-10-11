# Write a Python function that accepts a list of integers and performs the following operations in order:

# 1. Ignore negative numbers.
# 2. Keep only even numbers.
# 3. Square each remaining number.
# 4. Calculate the total of the squared values.
# 5. Return the total, count of squared values and largest squared value.



def process(numbers):
    total = 0
    count = 0
    largest = None

    for x in numbers:
        if x < 0:
            continue
        if x % 2 != 0:
            continue
        sq = x * x
        total += sq
        count += 1
        if largest is None or sq > largest:
            largest = sq

    return total, count, largest

total, count, largest = process([-2, 1, 2, 3, 4, 6, -8])
print("Total:", total)
print("Count:", count)
print("Largest squared value:", largest)