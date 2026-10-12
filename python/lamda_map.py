#to convert string to integer

num=["10","20","30"]
int1=list(map(int,num))
print(int1)


#convert string to upper case

names=["asd","mnb"]
name=list(map(str.upper,names))
print(name)



#squuare of list
def squ(x):
    return x*x
numb=[1,2,3,4,5]

square=list(map(squ,numb))
print (square)


#addition of two lists

list1=[1,2,3]
list2=[10,20,30]

add=list(map(lambda x,y:x+y,list1,list2 ))
print(add)

#to print even number using filter

num_list=[1,2,3,4,5,6]
r=list(filter(lambda x: x%2==0,num_list))
print(r)

# name=["sahil","sujal","vishal","shubham"]
# result=list(filter(lambda n:len[n]<=5,name))
# print(result)