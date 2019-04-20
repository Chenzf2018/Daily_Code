# LISTING 6.5 GCDFunction.py


def gcd(n1, n2):
    gcd = 1
    k = 2  # Possible gcd

    while k <= n1 and k <= n2:
        if n1 % k == 0 and n2 % k == 0:
            gcd = k
        k += 1

    return gcd
