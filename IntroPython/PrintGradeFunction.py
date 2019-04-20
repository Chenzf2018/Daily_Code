# LISTING 6.2 PrintGradeFunction.py


def print_grade(score):  # function name should be lowercase
    if score < 0 or score > 100:
        print("Invalid score!")
        return  # Same as: return None

    if score >= 90.0:
        print("A")
    else:
        print("B")


def main():
    score = eval(input("Enter a score: "))
    print("The grade of", score, "is", end=" ")
    print_grade(score)


main()
