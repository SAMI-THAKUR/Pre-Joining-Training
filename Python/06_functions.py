# Parameters and Arguments
# Parameter: Variable defined in a function.
# Argument: Actual value passed to the function when calling it.

def greet(name):
    print(f"Hello {name}")

greet("Sami")


# Return
# return sends a value back to the caller.
# It allows the function result to be stored or reused.
def add(a, b):
    return a + b

result = add(10, 20)
print(result)


# *args
# *args allows a function to accept any number of positional arguments.
# The arguments are stored as a tuple.

def total_marks(*marks):
    return sum(marks)

print(total_marks(80, 90, 70))


# **kwargs
# **kwargs allows a function to accept any number of keyword arguments.
# The arguments are stored as a dictionary.

def student_info(**details):
    for key, value in details.items():
        print(key, ":", value)

student_info(
    name="Sami",
    age=22,
    course="AI & DS"
)