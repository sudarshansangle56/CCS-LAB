from Cryptodome.Cipher import DES
from secrets import token_bytes
newkey =  token_bytes(8)
cipher = DES.new(newkey, DES.MODE_EAX)
A= str(input("Enter the msg :"))
data = A.encode()
nonce = cipher.nonce
ciphertext = cipher.encrypt(data)
print("Cipher of this", ciphertext)
cipher = DES.new(newkey, DES.MODE_EAX, nonce=nonce)
palintext=(cipher.decrypt(ciphertext))
print("Plain text:", palintext)