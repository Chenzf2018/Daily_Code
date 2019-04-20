# LISTING 6.10 MultipleReturnValueDemo.py


def sort(n1, n2):
    if n1 < n2:
        return n1, n2
    else:
        return n2, n1


number1, number2 = sort(3, 2)
print("number1 is", number1)
print("number2 is", number2)
