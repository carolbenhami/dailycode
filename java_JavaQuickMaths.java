import java.util.Scanner;



public class JavaQuickMaths{
    public static void main(String [] args){
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        System.out.print("Looping from 1.0 to 5.0 with rounding methods: \n");
        for(double i = 1.0; i != 5.0; i = i + 0.5){
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        System.out.print("Number: " + i +"  Ceil: " + Math.ceil(i) + "  Floor: " + Math.floor(i) + "  Rint: " + Math.rint(i) + "  Round: " + Math.round(i) + "\n");
        }
        System.out.print("\n\n\n");
        
        
        
        // 2. Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        //    - Store the number
        double decNum = scanner.nextDouble();
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("Ceil: " + Math.ceil(decNum) + "  Floor: " + Math.floor(decNum) + "  Rint: " + Math.rint(decNum) + "  Round: " + Math.round(decNum) + "\n\n\n");
        
        
        // 3. Prompt the user to enter an integer
        System.out.print("Enter an integer number: ");
        //    - Store the integer
        int intNum = scanner.nextInt();
        //    - Prompt the user to enter a string
        System.out.print("Enter a word: ");
        //    - Store the string
        String word = scanner.next();
        //    - Print the entered integer and string
        System.out.print("You entered integer: " + intNum + "\n");
        System.out.print("You entered word: " + word + "\n\n\n");
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        double dOfI = intNum;
        System.out.print("Implicit cast (int -> double): " + dOfI + "\n");
        
        //    - Convert the decimal number to int (explicit cast) and print
        int iOfD = (int)decNum;
        System.out.print("Explicit cast (double -> int): " + iOfD + "\n");
        //    - Convert the integer to a char (ASCII representation) and print
        char cOfI = (char)intNum;
        System.out.print("Casting int to char (ASCII): " + cOfI + "\n\n\n");
    
        
        // 5. Prompt the user to enter a character
        System.out.print("Enter a character: ");
        //    - Store the character
        char newChar = scanner.next().charAt(0);
        //    - Convert the character to its ASCII value (int) and print
        int intValue = newChar;
        System.out.print("ASCII value of ' " + newChar+ "' is: " + intValue + "\n\n\n");
        
        // 6. Demonstrate String vs. new String()
        System.out.print("String Comparisons: \n");
        //    - Create a String literal and assign it to two variables
        String str1 = "Hello";
        String str2 = str1;
        //    - Create another String using new String()
        String str3 = new String("Hello");
        //    - Compare the first two strings using == (reference check)
        System.out.println("str1 == str2: " + (str1==str2) );
        //    - Compare one literal with the new String() object using ==
        System.out.println("str1 == str3: " + (str1==str3) );
        //    - Compare the content of both strings using .equals()
        System.out.print("str1.equals(str3): " + str1.equals(str3));
        //    - Print the results
        
        // Close the Scanner object
        scanner.close();
    }
}
