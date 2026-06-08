# Integer to String
age = 21
age_str = str(age)

print(age_str)
print(type(age_str))

# String to Integer
num = "100"
num_int = int(num)

print(num_int)
print(type(num_int))

# Integer to Float
x = 10
y = float(x)

print(y)
print(type(y))

# Float to Integer
price = 99.99
price_int = int(price)

print(price_int)

# =====================================
# IMPORTANT RULES TO REMEMBER
# =====================================

# int("123") Valid
# int("12.5") Error
# int("SAMI") Error

# float("12.5")   Valid
# float("100")    Valid
# float("Hello")  Error

# bool(0) False
# bool(1) True

# bool("") False
# bool("Hello") True

# int(19.99) 19 (decimal part removed)

# str(anything) Usually works
# Example: str(100), str(3.14), str(True)
