# LISTING 5.11 TestBreak.py

sumOfAll = 0
number = 0

while number < 20:
    number += 1
    sumOfAll += number
    if sumOfAll > 100:
        break
print("The number is", number)
print("The sum is", sumOfAll)
