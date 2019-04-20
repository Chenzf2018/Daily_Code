# LISTING 7.1 Circle.py

import math


class Circle:
    # Construct a circle object: initializer
    def __init__(self, radius=1):
        self.radius = radius

    def get_perimeter(self):
        return 2 * self.radius * math.pi

    def get_area(self):
        return math.pi * (self.radius ** 2)

    def set_radius(self, radius):
        self.radius = radius
