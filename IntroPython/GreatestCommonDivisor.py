n1 = eval(input("Enter first number: "))
n2 = eval(input("Enter second number: "))

gcd = 1
k = 2

# while k <= n1 && k <= n2:
while k <= n1 and k <= n2:
    if n1 % k == 0 and n2 % k == 0:
        gcd = k
    k += 1
print("The greatest common divisor of", n1, "and", n2, "is", gcd)
