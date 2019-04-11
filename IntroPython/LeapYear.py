# LISTING 4.9 LeapYear.py

year = eval(input("Enter a year: "))
isLeapYear = (year % 100 == 0 and year % 4 == 0) or \
             (year % 400 == 0)
# if isLeapYear:
print(year, "is a leap year? ", isLeapYear)
