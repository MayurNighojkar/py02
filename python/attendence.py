#Q1. Employee Attendance Analyzer
#Calculate total present days, absent days, attendance percentage, and determine whether the employee is eligible for a bonus.

total = int(input("Enter total number of working days : "))
total_present=0
absent=0
invalid=0
for i in range(1, total+1):
    present = (input("present for day " + str(i) + " y for yes or and n for no: ")).lower()


    if present=='y':
        total_present=total_present+1

    elif present=="n":
        absent=absent+1

    else :
        invalid=invalid+1

total=total-invalid
att_per = (total_present / total) * 100

print ("you have put wrong input ",invalid, "times")
print("in ",total,"days you were present for", total_present,"days")
print("in ",total,"days you were absent for", absent,"days")
print("your attendance percentage is", att_per, "%")


if att_per >= 75:
    print("you are eligible for bonus")
else:
    print("you are not eligible for bonus")