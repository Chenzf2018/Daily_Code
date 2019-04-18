# LISTING 5.3 GuessNumber.py

import random

number = random.randint(0, 100)
print("Guess a magic number between 0 and 100.")

guess = -1
while guess != number:
    guess = eval(input("Enter your guess: "))
    if guess == number:
        print("You are right!")
    elif guess > number:
        print("Your guess is too high!")
    else:
        print("Your guess is too low!")
