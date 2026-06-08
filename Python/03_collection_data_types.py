# ------ LIST
# Allows duplicate
# Mutable

cars = ["Asto Martin", "BMW", "Mercedaes"]
print(cars)

cars.append("Ferrari")
cars.insert(2, "Audi")

print(cars)

cars.remove("BMW")
print(cars)

print(cars[0])
cars[1]="Jaguar"
print(cars)
print(len(cars))

# ------ TUPLE
# Immutable (cannot be changed)
# Faster than lists

coordinates = (10, 20, 30)

print(coordinates)

print(coordinates.count(10))
print(coordinates.index(20))

print(coordinates[0])

print(len(coordinates))

# ------ SET
# Unordered
# No duplicate values
# Mutable

numbers = {1, 2, 3}

numbers.add(4)
numbers.add(5)

print(numbers)

numbers.remove(2)

print(numbers)

set1 = {1, 2, 3}
set2 = {3, 4, 5}

print(set1.union(set2))
print(set1.intersection(set2))
print(set1.difference(set2))

# ------ DICTIONARY
# Stores data as key value
# Mutable
# Keys must be unique

student = {
    "name": "Sami",
    "age": 22
}

print(student)

student["course"] = "AI & DS"

print(student)

print(student.keys())
print(student.values())
print(student.items())

print(student.get("name"))

student.pop("age")

print(student)