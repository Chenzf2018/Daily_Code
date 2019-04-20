# LISTING 6.3 ReturnGradeFunction.py


def get_grade(score):
    if score >= 90:
        return 'A'
    else:
        return 'B'


def main():
    score = eval(input("Enter a score: "))
    print("The grade of", score, "is", get_grade(score))


main()
