# LISTING 8.4 Rational.py


class Rational:
    def __init__(self, numerator=1, denominator=0):  # 分子；分母
        divisor = gcd(numerator, denominator)
        self.__numerator = (1 if denominator > 0 else -1) * int(numerator / divisor)
        self.__denominator = int(abs(denominator) / divisor)

    def __add__(self, second_rational):
        n = self.__numerator * second_rational[1] + self.__denominator * second_rational[0]
        d = self.__denominator * second_rational[1]
        return Rational(n, d)
    # a/b + c/d = (ad + bc)/bd --> ad + bc : n; bd : d




def gcd(n, d):
    n1 = abs(n)
    n2 = abs(d)
    gcd = 1
    k = 1

    while k <= n1 and k <= n2:
        if n1 % k == 0 and n2 % k == 0:
            gcd = k
        k += 1

    return gcd
