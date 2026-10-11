from functools import reduce
list1=[1,2,3,4,5,6]
even=(filter(lambda x:x%2==0,list1))
sq=(map(lambda x:x*x,even))
add=(reduce(lambda a,b:a+b,list(sq)))
print (add)





result=(reduce(lambda a,b:a+b),sq=(map(lambda x:x*x)),(filter(lambda x:x%2==0)))
print (result)