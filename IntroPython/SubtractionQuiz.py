# LISTING 4.4 SubtractionQuiz.py
import random

number1 = random.randint(0, 9)
number2 = random.randint(0, 9)

if number1 < number2:
    number1, number2 = number2, number1  # Simultaneous assignment

answer = eval(input("What's " + str(number1) + " - " + str(number2) + " ? "))
if answer == number1 - number2:
    print("You are right!")
else:
    print("Your answer is wrong.\n", number1, '-', number2, "is", number1-number2)
