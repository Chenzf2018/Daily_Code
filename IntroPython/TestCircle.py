# LISTING 7.2 TestCircle.py

from Circle import Circle


def main():
    circle1 = Circle()
    print("The area of the circle of radius", circle1.radius, "is", circle1.get_area())

    circle2 = Circle(25)
    print("The area of the circle of radius", circle2.radius, "is", circle2.get_area())
    circle2.radius = 100
    print("The area of the circle of radius", circle2.radius, "is", circle2.get_area())


main()
