import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arraySearch.java {

    public static void main(String[] args) {
        // TODO: Get array size from user using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array (positive integer): ");
        int arraySize = 0;
        
        // TODO: Validate input to ensure a positive integer for array size
        boolean flag = false;
        while (flag != true){
        if (scanner.hasNextInt() == true){
            flag = true;
            arraySize = scanner.nextInt();
        }
        else{
            System.out.print("Invalid input! \n" );
            System.out.println("Enter the size of the array (positive integer): ");
            scanner.next();
        }   
        }
        flag = false;
        
        // TODO: Create an array of the specified size and fill with random numbers
        Random rand = new Random();
        int [] list = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            list[i] = rand.nextInt(1000);
            
        }

        // TODO: Get target number from user using Scanner
        System.out.println("Enter the target number (positive integer): ");
        int targetNum = 0;
        
        // TODO: Validate input to ensure a positive integer for the target number if found
        while (flag != true){
        if (scanner.hasNextInt() == true){
            flag = true;
            targetNum = scanner.nextInt();
        }
        else{
            System.out.print("Invalid input! \n" );
            System.out.println("Enter the target number (positive integer): ");
            scanner.next();
        }   
        }

        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();

        // TODO: Implement linear search to find the index of the target number
        int targetIndexLin = 0;
        for (int i = 0; i < list.length; i++){
            if (targetNum == list[i]){
                targetIndexLin = i;
            }
            else{
                targetIndexLin = -1;
            }
        }

        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...");
        
        // TODO: Sort the array as specified above
        java.util.Arrays.sort(list);

        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        // TODO: Implement binary search to find the index of the target number if found, -1 if not
        int targetIndexBin = java.util.Arrays.binarySearch(list, targetNum);

        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");

        // TODO: Display results specified in Display Output section
        System.out.print("Index of Linear Search : " + targetIndexLin + "\n");
        System.out.print("Index of Binary Search : " + targetIndexBin + "\n");
        if ((binaryEndTime - binaryStartTime)>(linearEndTime - linearStartTime)){
            System.out.println("Linear was faster!");
        }
        else{
            System.out.println("Binary was faster!");
        }
            
        }
}
