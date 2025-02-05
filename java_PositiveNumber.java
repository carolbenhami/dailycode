import java.util.Scanner;

class java_PositiveNumber {
    public static void main(String[] args) {
        // Declare a variable for user input
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        // REPEAT AT LEAST ONCE
        // DO
        //     Prompt the user to enter a positive number
        System.out.print("Enter a positive number: ");
        //     Read input
        input = scanner.nextInt();
        // WHILE (input is negative)
        while(input <= 0){
        
        System.out.println("Invalid input. Try again.");
        System.out.print("Enter a positive number: ");
         input = scanner.nextInt();
        }
        // Display valid input message
        System.out.println("You entered: "+ input);
        // END
    }
}
