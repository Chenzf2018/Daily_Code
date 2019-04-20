# LISTING 7.6 CircleWithPrivateRadius.py

import math


class Circle:
    def __init__(self, radius=1):
        self.__radius = radius

    def get_radius(self):
        return self.__radius

    def get_perimeter(self):
        return 2 * math.pi * self.__radius

    def get_area(self):
        return math.pi * (self.__radius ** 2)
