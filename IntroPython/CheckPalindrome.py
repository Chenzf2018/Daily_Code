# LISTING 8.1 CheckPalindrome.py


def main():
    s = input("Enter a string: ").strip()

    if is_palindrome(s):
        print(s, "is palindrome.")
    else:
        print(s, "is not palindrome.")


def is_palindrome(s):
    low = 0
    high = len(s) - 1

    while low < high:
        if s[low] != s[high]:
            return False

        low += 1
        high -= 1

    return True


main()
