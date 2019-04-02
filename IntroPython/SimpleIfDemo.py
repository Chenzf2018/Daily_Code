# LISTING 4.2 SimpleIfDemo.py

import random

# number = eval(input("Enter an integer: "))
number = random.randint(0, 9)

if number % 5 == 0:
    print("Hi Five.")

if number % 2 == 0:
    print("Hi even.")
else:
    print("Hi", number)
