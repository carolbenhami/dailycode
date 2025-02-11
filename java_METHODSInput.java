import java.util.Scanner;

public class java_METHODSinput {
   public static int sumCalc (int num1, int num2, int num3){
        // Calculate sum
        int sum = num1 + num2 + num3;
        return sum;
   }
   
   public static int findMax(int num1, int num2, int num3){
       // Find max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max; 
   }
    
   public static int findMin(int num1, int num2, int num3){
        // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
   } 

    public static double avg(int sum){
        // Calculate average
        double average = sum / 3.0;
        return average;
    }
    
    public static boolean positiveCheck(int num1, int num2, int num3){
        // Check if all numbers are positive
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
    
    public static void prints(int sum, int max, int min, double average, int num1, int num2, int num3, boolean allPositive){
         
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static void processNumbers(int num1, int num2,  int num3) {
        int sum = sumCalc(num1, num2, num3);
        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);
        double average = avg(sum);
        boolean pos = positiveCheck(num1, num2, num3);
        prints( sum,  max,  min,  average,  num1,  num2,  num3, pos);
        
    }   

    public static void getUserInput(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type in first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Type in second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Type in third number: ");
        int num3 = scanner.nextInt();
        
        processNumbers( num1, num2, num3);
        
    }
    public static void main(String[] args) {
        getUserInput();
    }
}
