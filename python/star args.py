def larg1(*number):
    larg=number[0]
    for num in number:
        if num>larg:
            larg=num
    return larg
print(larg1(5,10,30,15))