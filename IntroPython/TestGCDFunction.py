# LISTING 6.6 TestGCDFunction.py

from GCDFunction import gcd

n1 = eval(input("Enter the first integer: "))
n2 = eval(input("Enter the second integer: "))

print("The greatest common divisor for", n1, "and", n2, "is", gcd(n1, n2))
