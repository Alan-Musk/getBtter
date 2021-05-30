from cs50 import get_int

numbers=[]

while True:
    number=get_int("Number:")

    if not number:
        break

    if number not in numbers:
        numbers.append(number)

print()
for number in numbers:
    print(number)