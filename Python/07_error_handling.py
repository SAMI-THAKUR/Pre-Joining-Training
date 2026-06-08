# Try-Except
# Used for exception handling.
# Helps prevent the program from crashing when an error occurs.

try:
    num = int(input("Enter a number: "))
    print("You entered:", num)

except ValueError:
    print("Invalid input")


# Else-Finally
# else runs only if no exception occurs.
# finally always runs, whether an exception occurs or not.

try:
    a = 10
    b = 2

    result = a / b

except ZeroDivisionError:
    print("Cannot divide by zero")

else:
    print("Result:", result)

finally:
    print("Program finished")


# Raise
# raise is used to manually generate an exception.
# Useful for enforcing rules and validating data.

age = -5

if age < 0:
    raise ValueError("Age cannot be negative")