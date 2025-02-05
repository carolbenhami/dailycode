// BEGIN
class java_SkipThree {
    public static void main(String[] args) {

// Loop through numbers 1 to 20
// FOR each number from 1 to 20 DO
    for(int x = 1; x<=20; x++){
//     IF number is divisible by 3 THEN
        if(x % 3 == 0)
//         Skip this iteration
            continue;
//     ELSE
        else{
//         Print the number
            System.out.print(x + "\n");
//     END IF
        }
// END FOR
    }
// END

    }
}
