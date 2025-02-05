// BEGIN
import java.util.Scanner;

public class GuessNumber{
    public static void main(String [] args){
      // Choose a hidden number
      int randomNum = (int)(Math.random() * 101); // 0 to 100
      // Prompt the user to start guessing
      System.out.print("Guess a magic number between 0 and 100\n\n\n");
      int guess = 0;


    // Repeat until the correct guess is made
    // WHILE (true) DO
    while (guess != randomNum){
    
        //     Ask for a guess
        System.out.print("Enter your guess: ");
        Scanner scanner = new Scanner(System.in);
        //     Get user input
        guess = scanner.nextInt();

//     IF the guess is correct THEN
        if(guess == randomNum){
//         Display success message
            System.out.print("Yes, the number is "+ randomNum);
//         Exit the loop
            break;
        }
//     ELSE IF the guess is too high THEN
        else if(guess > randomNum){
//         Give a hint
            System.out.println("Your guess is too high!\n\n");
        }
//     ELSE
        else{
//         Give a different hint
            System.out.println("Your guess is too low:(\n\n");
//     END IF
    }
// END WHILE
    }
// END
  
    }
}
