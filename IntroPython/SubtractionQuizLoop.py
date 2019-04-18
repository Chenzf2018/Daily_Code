# LISTING 5.4 SubtractionQuizLoop.py

import random
import time

correctCount = 0
count = 0  # Count the number of question
NUMBER_OF_QUESTION = 5

startTime = time.time()

while count < NUMBER_OF_QUESTION:
    number1 = random.randint(0, 9)
    number2 = random.randint(0, 9)
    if number1 < number2:
        number1, number2 = number2, number1
    result = eval(input("What's " + str(number1) + " - " + str(number2) + " = ? "))
    if result == number1 - number2:
        print("You are right!")
        correctCount += 1
    else:
        print("You are wrong!", number1, "-", number2, "=", number1 - number2)

    count += 1

endTime = time.time()
print("Correct count is", correctCount, "out of", NUMBER_OF_QUESTION, \
      "\nTest time is", endTime - startTime, "seconds.")
