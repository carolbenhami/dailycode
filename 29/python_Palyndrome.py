print("This code checks if a string is a palindrome\n\n")

def palindrome():
    #Gets user input for the string to be checked
    str = input("Enter the string to be checked: ").lower()

    #Makes the input a list
    str2 = list(str)
   
    #Creates a counter to iterate through the original list
    x = -1
    #Creates a new list to be reversed
    str3 = []
    
    #Iterates through the original list of string
    for i in str2:
        #Add the numbers in reversed order to new list
        str3.append(i)
        #Makes the counter more negative to move towards beginning of original list
        x-=1

    #Checks if both lists are equal. Print output based on result.
    if str3 == str2:
        print("It is a palindrome")
    else: 
        print("It is not a palindrome")

palindrome()