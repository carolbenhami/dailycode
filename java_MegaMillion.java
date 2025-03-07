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
    static int usermegaBall;
    static int ticketCost;
    static int megaBall;
    static int megaplier;
    static double winnings;
    static int matches;

    public static void main(String[] args) {
        initializeGame();

        // TODO: Run the game loop until the player can no longer play
        while (balance >= 2 && exitFlag == false){
            runGame();
        }

        printGameSummary();
    }

    // TODO: Initialize the game (set balance, print welcome message)
    public static void initializeGame(){
        balance = 50.00;
        System.out.println("     WELCOME TO MEGA MILLIONS!");
        System.out.println("======================================");
        System.out.println("You start with $50.00.\n");
        System.out.println("--------------------------------------");
    }

    // TODO: Run the game loop (handle multiple rounds of play)
    public static void runGame(){
        System.out.print("Current Balance: $" + balance + "\n");
        System.out.println("--------------------------------------");
        playRound();

    }

    // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)
    public static void playRound(){
        System.out.print("Do you want Quick Pick? (yes/no): ");
        char quickPlay = scanner.next().charAt(0);
        while (quickPlay != 'y' && quickPlay != 'Y' && quickPlay != 'n' && quickPlay != 'N'){
            quickPlay = scanner.next().charAt(0);
        }

        if(quickPlay == 'y' || quickPlay == 'Y'){;
            userArray = generateNumbers();
            Arrays.sort(userArray);
            usermegaBall = random.nextInt(25)+1;
            System.out.print("Your Quick Pick: " + Arrays.toString(userArray) + " ");
            System.out.print("Mega Ball: " + usermegaBall + "\n");
        }

        else{
            System.out.print("Manually pick numbers 1-70: ");
            userArray = new int[5];
            int userNum;
            boolean containDupe;
            for(int i = 0; i < 5; i++){
                do{
                    userNum = getValidNumber(70);
                    containDupe = contains(userArray, userNum);}
                while(containDupe);
                userArray[i] = userNum;
            }
            Arrays.sort(userArray);
            System.out.print("Manually pick MegaBall 1-25: ");
            usermegaBall = getValidNumber(25);
            System.out.print("Your Picks: " + Arrays.toString(userArray) + "  Mega Ball: " + usermegaBall);
        }

        System.out.print("Do you want to add Megaplier for $1?  (yes/no): ");
        char addMegaplier = scanner.next().charAt(0);
        while (addMegaplier != 'y' && addMegaplier != 'Y' && addMegaplier != 'n' && addMegaplier != 'N'){
            addMegaplier = scanner.next().charAt(0);
        }

        if (addMegaplier == 'y' || addMegaplier == 'Y'){
            ticketCost = 3;
            megaplier = getRandomMegaplier();
        }
        else{
            ticketCost = 2;
        }
        totalSpent = totalSpent + ticketCost;
        updateBalance();
        ticketCost = 0;

        draw = generateNumbers();
        Arrays.sort(userArray);
        megaBall = random.nextInt(25)+1;
        System.out.println("=======================================");
        System.out.println("            WINNING NUMBERS:           ");
        System.out.println("=======================================");
        System.out.print(Arrays.toString(draw) + " Mega Ball: " + megaBall + "\n");
        if (addMegaplier == 'y' || addMegaplier == 'Y') {
            System.out.print("Megaplier Drawn: x" + megaplier + "\n");
        }
        System.out.println("=======================================\n");
        matches = countMatches();
        winnings = getPrize();
        if (addMegaplier == 'y' || addMegaplier == 'Y'){
            if (winnings != 1000000){
                winnings = winnings * megaplier;
            }
        }

        System.out.println("You won: $" + winnings);
        System.out.println("New Balance: $" + balance + "\n");

        totalWinnings = totalWinnings + winnings;
        updateBalance();
        winnings = 0;

        System.out.print("Do you want to play again? (yes/no)");
        char playAgain = scanner.next().charAt(0);
        while (playAgain != 'y' && playAgain != 'Y' && playAgain != 'n' && playAgain != 'N'){
            playAgain = scanner.next().charAt(0);
        }

        if (playAgain == 'n' || playAgain == 'N') {
            exitFlag = true;
        }


    }

    // TODO: Update balance after ticket purchase and winnings
    public static void updateBalance(){
        balance = balance - ticketCost;
        balance = balance + winnings;
    }

    // TODO: Print game summary (total spent, total winnings, final balance)
    public static void printGameSummary(){
        System.out.println("=======================================");
        System.out.println("            GAME OVER:           ");
        System.out.println("=======================================");
        System.out.print("Total Spent: $" + totalSpent + "\n");
        System.out.print("Total Winnings: $" + totalWinnings + "\n");
        System.out.print("Final Balance: $" + balance + "\n");
        System.out.println("=======================================");
    }

    // TODO: Generate an array of 5 unique random numbers (1-70)
    public static int[] generateNumbers(){
        int [] randomArray = new int[5];
        int randomNum;
        boolean containDupe;
        for(int i = 0; i<5; i++){
            randomNum = random.nextInt(70) + 1;
            do{
                randomNum = random.nextInt(70) + 1;
                containDupe = contains(randomArray, randomNum);}
            while(containDupe);
            randomArray[i] = randomNum;
        }
        return randomArray;
    }

    // TODO: Get a valid number input from the user within a given range
    public static int getValidNumber(int rangeMax){
        int userInput = 0;
        while (userInput < 1 || userInput > rangeMax){
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    // TODO: Check if an array contains a specific number
    public static boolean contains(int[] array, int number){
        for(int n: array){
            if (n == number) return true;
        }
        return false;
    }

    // TODO: Count matching numbers between user and winning numbers
    public static int countMatches(){
        matches = 0;
        int count = 0;
        for(int i : draw){
            for(int x : userArray){
                if(i == x){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // TODO: Determine the prize amount based on matches
    public static double getPrize(){
        double prize = 0;
        if(matches == 5  && usermegaBall == megaBall){
            prize = 100000000;
        }
        else if (matches == 5  && usermegaBall != megaBall){
            prize = 1000000;
        }
        else if (matches == 4  && usermegaBall == megaBall){
            prize = 10000;
        }
        else if (matches == 4  && usermegaBall != megaBall){
            prize = 500;
        }
        else if (matches == 3  && usermegaBall == megaBall){
            prize = 200;
        }
        else if (matches == 3  && usermegaBall != megaBall){
            prize = 10;
        }
        else if (matches == 2  && usermegaBall == megaBall){
            prize = 10;
        }
        else if (matches == 1  && usermegaBall == megaBall){
            prize = 4;
        }
        else if (matches == 0  && usermegaBall == megaBall){
            prize = 2;
        }
        else{
            prize = 0;
        }
        return prize;
    }

    // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)
    public static int getRandomMegaplier(){
        int [] megaplierArray = new int[]{2, 3, 4, 5};
        int megaplierIndex = random.nextInt(megaplierArray.length);
        return megaplierArray[megaplierIndex];
    }
}
