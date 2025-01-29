import java.util.Scanner;

public class java_NumCountdownJava{
    static void method(){
        
        System.out.println("This code prints a countdown of the inserted number.");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean flag = false;
        
        
        while (flag != true){
        if (scanner.hasNextInt() == true){
            flag = true;
            for(int i = scanner.nextInt(); i != 0; i--){
            System.out.print(i + "\n");
            }
        }
        
        else{
            System.out.print("Invalid input! \n" );
            System.out.print("Enter a number: ");
            scanner.next();
        }   
        }
        
    }
    public static void main(String [] args){
    method();
        
    }
}