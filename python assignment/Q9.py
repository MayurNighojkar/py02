# Predict the output or error produced by the following code. Explain why the error occurs and correct the code so that calling "update()" changes the global variable.

# Given Code:

# score = 50

# def update():
# print(score)
# score = score + 10

# update()
# print(score)

# Answer the Following Questions:

# 1. Why does the original code raise an error?
# 2. What is the correct use of the "global" keyword here?
# 3. What will the output be after correcting the code?


score = 50

def update():
    global score
    print(score)
    score = score + 10

update()
print(score)