import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("The factorial of "+ number + " is "+ fact(number));
    }
    
    public static int fact(int number){
            int integer = number;
            if (number <= 0){
                System.out.print("Not possible:(");
                System.exit(0);
            }
            else{
             for (int i = number - 1; i > 0; i--){
             integer *= i;
        }
            
            } 
            return integer;
        }
     
}
