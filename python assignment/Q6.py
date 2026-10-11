# Combine two already-sorted lists into one sorted list without using "sort()" or "sorted()".

# Use indexes to compare the current elements of both lists. Append the smaller element to the result, then append any remaining elements.
def merge(a, b):
    i = j = 0
    result = []

    while i < len(a) and j < len(b):
        if a[i] <= b[j]:
            result.append(a[i])
            i += 1
        else:
            result.append(b[j])
            j += 1

    while i < len(a):
        result.append(a[i])
        i += 1
    while j < len(b):
        result.append(b[j])
        j += 1

    return result

print(merge([1, 4, 7, 10], [2, 3, 8, 11, 15]))