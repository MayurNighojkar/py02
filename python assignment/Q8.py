# Write a recursive function to check whether a string is a palindrome. A palindrome reads the same forward and backward.

# Do not reverse the string using slicing or a built-in reverse method.

# Compare the characters at the left and right indexes, then recursively move both indexes inward. Define suitable base cases.


def is_palindrome(text, left=0, right=None):
    if right is None:
        right = len(text) - 1

    if left >= right:
        return True
    if text[left] != text[right]:
        return False

    return is_palindrome(text, left + 1, right - 1)

print(is_palindrome("racecar"))
print(is_palindrome("python"))