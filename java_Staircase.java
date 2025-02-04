import java.util.Scanner;

public class java_Staircase{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); //Initializes scanner
        System.out.print("This code takes user input and create a right-justified staircase with the amount of steps input by the user, as well as the symbol input by the user. \n\n");
        System.out.print("Enter the symbol for the staircase: ");
        char symbol = scanner.next().charAt(0); //Gets user input for the symbol
        System.out.print("Enter the number of steps on the staircase: ");
        int number = scanner.nextInt(); //Gets user input for the number
        
        String strchr = String.valueOf(symbol); //Converts symchar to string
        int row =  1;
        while (row != number+1){ // Loops until the number of the row is equal to the number input plus 1 (accounts for not starting at 0)
            int spaces = number - row; //Prints spaces first, accordingly to the necessary amount, which is essentially the number inout - number of the row
            
            //Prints spaces and symbols
            System.out.print(" ".repeat(spaces));
            System.out.print(strchr.repeat(row)+"\n");
            row ++; //Go to next row
            spaces = 0; //Reset number of spaces
        }
    }
}
