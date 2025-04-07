import hashlib;
str2hash="welcome to sanjivani"
result=hashlib.md5(str2hash.encode())
print("the hash code of of MD:", end="")
print(result.hexdigest())
