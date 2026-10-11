# Two strings are anagrams if they contain the same characters with the same frequencies, regardless of order.

# Write a Python program to check whether two strings are anagrams without using "sorted()".

# First, solve the problem using a dictionary to count character frequencies. Then consider how case sensitivity and spaces should be handled.

def is_anagram(a, b):
    a = a.lower().replace(" ", "")
    b = b.lower().replace(" ", "")

    if len(a) != len(b):
        return False

    counts = {}
    for ch in a:
        counts[ch] = counts.get(ch, 0) + 1

    for ch in b:
        if ch not in counts or counts[ch] == 0:
            return False
        counts[ch] -= 1

    return True

print(is_anagram("listen", "silent"))       
print(is_anagram("hello", "world")) 
print(is_anagram("Dormitory", "Dirty Room"))