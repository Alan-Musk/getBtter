from cs50 import get_string

students=[]

for i in range(3):
    name=get_string("name:")
    dorm=get_string("dorm:")

    student={"name":name,"dorm":dorm}

    students.append(student)

for student in students:
    print(f"{student['name']} 在{student['dorm']}")