# LISTING 4.1 AdditionQuiz.py

import random

number1 = random.randint(0, 9)
number2 = random.randint(0, 9)

# input得到的是string，故需字符拼接“+”，str()转换
answer = eval(input("What's " + str(number1) + " + " + str(number2) + " ? "))
print(number1, "+", number2, "=", answer, "is", number1 + number2 == answer)
