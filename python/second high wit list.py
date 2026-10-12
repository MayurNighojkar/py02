mar=[10,20,30,40,50]
h_m=0
s_h=0

for i in range(len(mar)):
    if mar[i]>h_m:
        s_h=h_m
        h_m=mar[i]

    elif mar[i]>s_h and mar[i]!=h_m:
        s_h=mar[i]

print(s_h)
