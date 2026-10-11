# Write a function called "analyze_marks()" that accepts any number of student marks using "*args" and calculates:

# 1. Total marks
# 2. Average marks
# 3. Highest mark
# 4. Number of passing marks, where the pass mark is 40


def analyze_marks(*marks):
    if len(marks) == 0:
        print("No marks supplied.")
        return None

    total = 0
    count = 0
    highest = marks[0]
    passing = 0

    for m in marks:
        total += m
        count += 1
        if m > highest:
            highest = m
        if m >= 40:
            passing += 1

    average = total / count

    print("Total:", total)
    print("Average:", average)
    print("Highest:", highest)
    print("Passing count:", passing)
    return total, average, highest, passing

analyze_marks(35, 72, 80, 45, 90, 30)