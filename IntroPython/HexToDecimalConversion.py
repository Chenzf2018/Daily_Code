# LISTING 8.2 HexToDecimalConversion.py


def main():
    hex = input("Enter a hex number: ").strip()

    decimal = hex_to_decimal(hex.upper())

    # if decimal == None:
    if decimal is None:
        print("Incorrect hex number!")
    else:
        print("The decimal value for hex number", hex, "is", decimal)


def hex_to_decimal(hex):
    decimal_value = 0
    for i in range(len(hex)):
        ch = hex[i]
        if 'A' <= hex[i] <= 'F' or '0' <= hex[i] <= '9':
            decimal_value = decimal_value * 16 + hex_char_to_decimal(ch)
        else:
            return None

    return decimal_value


def hex_char_to_decimal(ch):
    if 'A' <= ch <= 'F':
        return 10 + ord(ch) - ord('A')
    else:
        return ord(ch) - ord('0')


main()
