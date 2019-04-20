# LISTING 6.8 Decimal2HexConversion.py


def decimal_to_hex(decimal_value):
    hex = " "
    while decimal_value != 0:
        hex_value = decimal_value % 16
        hex = to_hex_char(hex_value) + hex
        decimal_value = decimal_value // 16
    return hex


def to_hex_char(hex_value):
    if 0 <= hex_value <= 9:
        return chr(hex_value + ord('0'))
    else:
        return chr(hex_value - 10 + ord('A'))


def main():
    decimal_value = eval(input("Enter a decimal number: "))
    print("The hex number for decimal", decimal_value, "is", decimal_to_hex(decimal_value))


main()
