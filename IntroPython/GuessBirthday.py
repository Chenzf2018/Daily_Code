# LISTING 4.3 GuessBirthday.py

day = 0  # birth day to be determined

question1 = "Is your birthday in Set1?\n" + \
    "1   3    5   7\n" + \
    "9   11  13  15\n" + \
    "17  19  21  23\n" + \
    "25  27  29  31\n" + \
    "Enter 0 for No and 1 for Yes: "
answer = eval(input(question1))
if answer == 1:
    day += 1

question2 = "Is your birthday in Set2?\n" + \
    "2   3    6   7\n" + \
    "10  11  14  15\n" + \
    "18  19  22  23\n" + \
    "26  27  30  31\n" + \
    "Enter 0 for No and 1 for Yes: "
answer = eval(input(question2))
if answer == 1:
    day += 2

question3 = "Is your birthday in Set3?\n" + \
    "4   5    6   7\n" + \
    "12  13  14  15\n" + \
    "20  21  22  23\n" + \
    "28  29  30  31\n" + \
    "Enter 0 for No and 1 for Yes: "
answer = eval(input(question3))
if answer == 1:
    day += 4

