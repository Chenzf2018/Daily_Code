# LISTING 6.7 PrimeNumberFunction.py


def is_prime(number):
    divisor = 2
    while divisor <= number / 2:
        if number % divisor == 0:
            return False
        divisor += 1

    return True


def print_prime_numbers(number_of_primes):
    NUMBER_OF_PRIMES = number_of_primes  # Variable in function should be lowercase
    NUMBER_OF_PRIMES_PER_LINE = 10
    count = 0
    number = 2

    while count < NUMBER_OF_PRIMES:
        if is_prime(number):
            count += 1
            print(number, end=" ")
            if count % NUMBER_OF_PRIMES_PER_LINE == 0:
                print()
        number += 1


def main():
    print("The first 50 prime numbers are")
    print_prime_numbers(50)


main()
