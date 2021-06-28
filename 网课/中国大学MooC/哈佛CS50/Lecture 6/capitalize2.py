from cs50 import get_string

s=get_string("Name:")

#c默认大小为0,自定义设置
for c in s:
    print(c.upper(),end="")
print()