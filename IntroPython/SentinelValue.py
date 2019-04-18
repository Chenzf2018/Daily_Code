# LISTING 5.5 SentinelValue.py

data = eval(input("Enter an integer (the input ends " + " if it is 0): "))
sumOfData = 0
while data != 0:
    sumOfData += data
    data = eval(input("Enter an integer (the input ends " + " if it is 0): "))
print("The sum is", sumOfData)
