def gcd(arg1, arg2): 
    if ((arg2==0)):
         return arg1
    if ((arg2!=0)):
         return gcd(arg2,arg1%arg2)

def isPrime(arg1): 
    if ((arg1==1)):
         return False
    if ((arg1!=1)):
         return helpPrime(arg1,2)

def helpPrime(arg1, arg2): 
    if ((arg1<=arg2)):
         return True
    if ((arg1%arg2==0)):
         return False
    if ((arg1%arg2!=0)):
         return helpPrime(arg1,arg2+1)

