numbers = [10, 20, 30, 20, 40, 30]

seen = []
seen1=[]

for n in numbers:
    if n in seen:
        seen1.append(n)
    seen.append(n)

print(seen1) 