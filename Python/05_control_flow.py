# If-Else
age = 18
if age >= 18:
    print("Adult")
else:
    print("Minor")

# For Loop
print("\nFor Loop:")
# Loop from 1 to 5
for i in range(1, 6):
    print(i)

# While Loop
print("\nWhile Loop:")
count = 1
# Repeat while condition is True
while count <= 5:
    print(count)
    count += 1  # Increment count by 1

# Break
print("\nBreak:")
# Stop the loop when i becomes 5
for i in range(10):
    if i == 5:
        break
    print(i)

# Continue
print("\nContinue:")

# Skip printing when i is 5
for i in range(10):
    if i == 5:
        continue
    print(i)

# Pass
print("\nPass:")
# pass is a placeholder; does nothing
for i in range(3):
    pass

# Loop Else
print("\nLoop Else:")
# else runs when the loop finishes normally
for i in range(5):
    print(i)
else:
    print("Loop completed successfully")