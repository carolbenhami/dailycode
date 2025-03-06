import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MegaMillions {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static double balance;
    static double totalWinnings = 0;
    static double totalSpent = 0;
    static boolean exitFlag = false;
    static int[] userArray;
    static int[] draw;

    public static void main(String[] args) {
        initializeGame();
        
        // TODO: Run the game loop until the player can no longer play
        //while (balance >= 2 || exitFlag == false){
            //runGame();
        //}
        
        //printGameSummary();
    }

    // TODO: Initialize the game (set balance, print welcome message)
    public static void initializeGame(){
        balance = 50.0;
        System.out.println("     WELCOME TO MEGA MILLIONS!");
        System.out.println("======================================");
        System.out.println("You start with $50.00.\n");
        System.out.println("--------------------------------------");
        draw = generateNumbers();
        System.out.print(Arrays.toString(draw));

    }

    // TODO: Run the game loop (handle multiple rounds of play)
    public static void runGame(){
        System.out.print("Current Balance: $" + balance);
        System.out.println("--------------------------------------");
        
    }

    // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)
    public static void playRound(){
        char quickPlay = scanner.next().charAt(0);
        while (quickPlay != 'y' || quickPlay != 'Y' || quickPlay != 'n' || quickPlay != 'N'){
            quickPlay = scanner.next().charAt(0);
        }
        if(quickPlay == 'y' || quickPlay == 'Y'){
            System.out.print("Quick play!");
            //userArray = generateNumbers()
        }
        else{
            System.out.print("No quick play!");
            //getValidNumber(70);
        }
        
        
    }

    // TODO: Update balance after ticket purchase and winnings
    public static void updateBalance(){
        
    }

    // TODO: Print game summary (total spent, total winnings, final balance)
    public static void printGameSummary(){
        
    }

    // TODO: Generate an array of 5 unique random numbers (1-70)
    public static int[] generateNumbers(){
        int [] randomArray = new int[5];
        for(int i = 0; i < 5; i++){
            randomArray[i] = random.nextInt(71);
            boolean containsBool = contains(randomArray, randomArray[i]);
            while (containsBool == true){
                randomArray[i] = random.nextInt(71);
                containsBool = contains(randomArray, randomArray[i]);
            }
 
    }
    return randomArray;
    }

    // TODO: Get a valid number input from the user within a given range
    //public static void getValidNumber(rangeMax){
        //while 
    //}

    // TODO: Check if an array contains a specific number
    public static boolean contains(int[] array, int number){
        for(int n: array){
            if (n == number) return true;
        }
        return false;
    }

    // TODO: Count matching numbers between user and winning numbers
    public static void countMatches(){
        
    }

    // TODO: Determine the prize amount based on matches
    //public static double getPrize(){
        
    //}

    // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)
    //public static int getRandomMegaplier(){
        
    //}
}
