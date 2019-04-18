# LISTING 5.1 RepeatSubtractionQuiz.py

import random

number1 = random.randint(0, 9)
number2 = random.randint(0, 9)

if number1 < number2:
    number1, number2 = number2, number1

# result = eval(input("Enter the result of " + number1 + " - " + number2 + " = "))
result = eval(input("Enter the result of " + str(number1) + " - " + str(number2) + " = "))
while result != number1 - number2:
    # result = eval(input("Enter the result of " + number1 + " - " + number2 + " = "))
    result = eval(input("You are wrong! Try it again: What's " + str(number1) + " - " + str(number2) + " = "))
print("You are right!")
