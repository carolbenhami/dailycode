import random as rand

list_size = rand.randint(1,15)
original_list = []

i = 1
for i in range (1, list_size+1):
    original_list.append(i)
    i+=1

to_be_removed = rand.randint(1,list_size)
print (to_be_removed)

original_list.remove(to_be_removed)

print (f"List with number removed: {original_list}\n")
def missingnum():
    for i in range (1,list_size + 1):
        if i not in original_list:
            original_list.insert(i-1, i)
            print (f"Appended List: {original_list}\n")

missingnum()
