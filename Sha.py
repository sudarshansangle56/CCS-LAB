import hashlib;
str2hash="welcome to sanjivani"
result=hashlib.sha1(str2hash.encode())
print("the hash code of of sha:", end="")
print(result.hexdigest())

