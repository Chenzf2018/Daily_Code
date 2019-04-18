# LISTING 5.13 PrimeNumber.py

NUMBER_OF_PRIMES = 50
NUMBER_OF_PRIMES_PER_LINE = 10
count = 0  # Count the number of prime numbers
number = 2  # A number to be tested for primeness

print("The first 50 prime numbers are ")

while count < NUMBER_OF_PRIMES:
    isPrime = True  # Is the current number prime?

    divisor = 2
    while divisor <= number / 2:
        if number % divisor == 0:
            isPrime = False
            break

        divisor += 1

    if isPrime:
        count += 1
        print(format(number, "5d"), end="")
        if count % NUMBER_OF_PRIMES_PER_LINE == 0:
            print()

    number += 1
