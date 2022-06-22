import smtplib
import json
import random

data = open(
    "C:\\Users\\Swapnil\\Documents\\GitHub\\TXT\\createNewTry.txt", 'r')
data = data.read()
data = json.loads(data)
email = data["email"]

otp = random.randint(1000, 9999)
writer = open(
    "C:\\Users\\Swapnil\\Documents\\GitHub\\TXT\\currentOtp.txt", 'w')
writer.write(str(otp))
writer.close()
message = f'Your otp for Team Lead Tool is {otp}'

smtp = smtplib.SMTP('smtp.gmail.com', 587)
smtp.starttls()
smtp.login('swapnilrgaikwad1@gmail.com', 'password')
smtp.sendmail('swapnilrgaikwad1@gmail.com', email, message)
smtp.quit()