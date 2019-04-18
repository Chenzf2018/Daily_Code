# LISTING 5.6 MultiplicationTable.py

print("            MultiplicationTable")
for i in range(1, 10):
    print("    ", i, end=" ")
print()
print("--------------------" * 3)

'''for i in range(1, 10):
    print(i, "|", end=" ")
    for j in range(1, 10):
        # print(i, i * j, end=" ")
        print(i * j)'''

for i in range(1, 10):
    print(i, "|", end=" ")
    for j in range(1, 10):
        print(format(i * j, "5d"), end=" ")
    print()
