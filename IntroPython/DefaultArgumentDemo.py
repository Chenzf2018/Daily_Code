# LISTING 6.9 DefaultArgumentDemo.py


def print_area(width = 1, height = 2):
    area = width * height
    print("width:", width, "\theight:", height, "\tarea:", area)


print_area()
print_area(4, 2.5)
print_area(height=5, width=3)
print_area(height=6.2)
print_area(width=1.2)
