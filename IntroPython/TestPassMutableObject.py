# LISTING 7.5 TestPassMutableObject.py

from Circle import Circle


def main():
    my_circle = Circle()
    # Print areas for radius 1, 2, 3, 4, 5
    n = 5
    print_area(my_circle, n)
    print("Radius is", my_circle.radius)
    print("n is", n)


def print_area(circle, times):
    print("Radius  \t\tArea")
    while times >= 1:
        print(circle.radius, "  \t\t\t", circle.get_area())
        circle.radius += 1
        times -= 1


main()
