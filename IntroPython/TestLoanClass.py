# LISTING 7.7 TestLoanClass.py

from Loan import Loan


def main():
    annual_interest_rate = eval(input("Enter yearly interest rate, for example, 7.25: "))
    number_of_years = eval(input("Enter number of years as an integer: "))
    loan_amount = eval(input("Enter loan amount, for example, 120000.95: "))
    borrower = input("Enter a borrower's name: ")

    loan = Loan(annual_interest_rate, number_of_years, loan_amount, borrower)

    print("The loan is for", loan.get_borrower())
    print("The monthly payment is", format(loan.get_monthly_payment(), ".2f"))
    print("The total payment is", format(loan.get_total_payment(), ".2f"))


main()
