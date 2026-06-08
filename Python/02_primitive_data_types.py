# Integer

age = 21
print(age)
print(type(age))

# String

name = "Sami"
print(name)
print(type(name))

# F-String (allows use of variable inside string)
print(f"My name is {name} and age is {age}")


# Important String Methods

text = "python programming"

print(text.upper()) # whole string to uppercase
print(text.lower()) # whole string to lowercase
print(text.title()) # First letter of every word capital
print(text.capitalize()) # First word capital

print(text.replace("python", "Java"))

words = text.split() # by default split on space
print(words)

joined = "-".join(words)
print(joined)

print(text.startswith("python"))
print(text.endswith("ing"))

print(text.find("programming"))


# Boolean

is_student = True
is_graduate = False

print(is_student)
print(is_graduate)
print(type(is_student))