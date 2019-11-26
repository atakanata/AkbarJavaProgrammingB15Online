package office_hour;

import java.util.Scanner;

public class Practice_11_25 {

    public static void main(String[] args) {

//        * In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

//        -Declare integer variables num1, num2, num3, sum.
        int num1, num2, num3, sum;
//        -Create a Scanner object named scan.
        Scanner scan = new Scanner(System.in);
//        -Display prompt "Enter 3 numbers:"
        System.out.println("Enter 3 numbers:");
//        -Using scanner object let user input 3 numbers
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

//        -Add 3 numbers and assign to sum variable
        sum = num1 + num2 + num3;
//        -Print "Sum of numbers: ValueOfSum"
        System.out.println("Sum of numbers: " + sum);


    }

}
