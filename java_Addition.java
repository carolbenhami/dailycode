// BEGIN
import java.util.Scanner;

public class java_Addition{
    public static void main(String [] args){
        // Generate two random numbers between 0 and 9
        // SET number1 = RANDOM(0-9)
        int num1 = (int)(Math.random() * 10); // 0 to 100
        // SET number2 = RANDOM(0-9)
        int num2 = (int)(Math.random() * 10); // 0 to 100

    // Prompt user for input
    Scanner scanner = new Scanner(System.in);
    // PRINT "What is " + number1 + " + " + number2 + "? "
    System.out.print("What is " + num1 + " + " + num2 + "? ");
    // READ answer
    int input = scanner.nextInt();

// Keep asking until the user gets it right
// WHILE (answer ≠ number1 + number2) DO
    while(input != (num1 + num2)){
//     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
    System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + "? ");
//     READ answer
    input = scanner.nextInt();
// END WHILE
    }
// Correct answer message
// PRINT "You got it!"
    System.out.print("You got it!");

// END
    }
}

