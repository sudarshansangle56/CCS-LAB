from Cryptodome.Cipher import AES
from secrets import token_bytes
newkey =  token_bytes(16)
cipher = AES.new(newkey, AES.MODE_EAX)
A= str(input("Enter the msg :"))
data = A.encode()
nonce = cipher.nonce
ciphertext = cipher.encrypt(data)
print("Cipher of this", ciphertext)
cipher = AES.new(newkey, AES.MODE_EAX, nonce=nonce)
palintext=(cipher.decrypt(ciphertext))
print("Plain text:", palintext)