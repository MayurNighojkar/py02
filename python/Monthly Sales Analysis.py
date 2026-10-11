'''Q10. Monthly Sales Analysis
Process sales data for 12 months and calculate:
Total annual sales
Average monthly sales
Highest monthly sales
Lowest monthly sales
Number of months with sales above ₹1,00,000
Percentage of high-sales months'''
h_s=0
l_s=0
t_m=0
s_a=0

for i in range (1,13):
    month=int(input("enter month "+str(i)+" sales : "))
    t_m=t_m+month
    
    if i==1:
        h_s=month
        l_s=month

    else:
        if month>h_s:
            h_s=month

        if month<l_s:
            l_s=month

    if month>100000:
        s_a=s_a+1
        
ave=t_m/12
per=(s_a/12)*100

print("total sales are: ",t_m)
print("average sales are: ",ave)
print("highest sale is: ",h_s)
print("lowest sale is: ",l_s)
print("Number of months with sales above ₹1,00,000 are :",s_a)
print("Percentage of high-sales months: ",per)