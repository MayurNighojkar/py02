#Q4. Login Security System
#allow a user a maximum of 3 login attempts. Display Login Successful if the password is correct; otherwise lock the account after 3 failed attempts.
og_pass=input("enter your password: ")
attempt=1

for i in range (3):
    password=input("enter the password to acess your account:")

    if og_pass!=password:
        print("you have entered wrong password")

        attempt=attempt+1

    else:
        print("welcome")
        break;

if attempt>=3:
    print("you are now blocked")

