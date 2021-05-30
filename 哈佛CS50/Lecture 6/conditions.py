from cs50 import get_int

x=get_int("x:")

y=get_int("y:")

if x<y:
    print("x小于y")
elif x>y:
    print("x大于y")
else:
    print("两个相等")
