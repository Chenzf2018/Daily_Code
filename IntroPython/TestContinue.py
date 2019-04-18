# LISTING 5.12 TestContinue.py

sumOfAll = 0
number = 0

while number < 20:
    number += 1
    if number == 10 or number == 11:
        continue
    sumOfAll += number
print("The sum is", sumOfAll)
