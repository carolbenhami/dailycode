import java.util.Scanner;
import java.util.Random;

class java_ArrayIntro {
    public static void task1(){
        int [] numbers = new int[5];
        System.out.print("Task 1  \n");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + "\n\n");
    }
    
    public static void task2(){
        int [] numbers = new int[5];
        numbers [0] = 21;
        numbers [1] = 12;
        numbers [2] = 22;
        numbers [3] = 11;
        numbers [4] = 2;
        System.out.print("Task 2  \n");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + "\n\n");
    }
    
    public static void task3(){
        int [] numbers = {21, 12, 22, 11, 2};
        System.out.print("Task 3  \n");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + "\n\n");
    }
    
    public static void task4(){
        int [] numbers = new int[5];
        for(int i = 0; i <=4 ; i++){
            numbers[i] = 3*(i+1);
        }
        System.out.print("Task 4  \n");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + "\n\n");
    }

    public static void task5(){
        System.out.print("Task 5  \n");
        char [] charArray = new char[5];
        charArray[0] = 'A';
        System.out.print(charArray[0] + " ");
        int charNum = charArray[0];
        for (int i = 1; i<5; i++){
            charNum += 2;
            char charCharNum = (char)charNum;
            charArray[i] = charCharNum;
            System.out.print(charArray[i] + " ");
        }
        System.out.print("\n\n");
    }
    
    public static void task6(){
        Scanner scanner = new Scanner (System.in);
        Random rand = new Random();
        System.out.print("Task 6  \n");
        System.out.print("Enter the size of the array:  \n");
        int input = scanner.nextInt();
        int [] numbers = new int[input];
        for (int i = 0; i < input; i++){
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n\n");
    }
    
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
}
