import pymongo
import json

client = pymongo.MongoClient("mongodb://localhost:27017")

db= client["member_management"]

collection= db["members"]

data = open(
    "C:\\Users\\Swapnil\\Documents\\GitHub\TXT\\createNewTry.txt",'r')
data = data.read()
data= json.loads(data)
print(data)
ifMatches= False
for member in collection.find({"email": data["email"]}):
    ifMatches= True


if ifMatches:
    writer= open(
        "C:\\Users\\Swapnil\\Documents\\GitHub\\TXT\\emailExists.txt", "w")
    writer.write('true')

else:
    writer = open(
        "C:\\Users\\Swapnil\\Documents\\GitHub\\TXT\\emailExists.txt", "w")
    writer.write('false')