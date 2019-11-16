package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {

    public static void main(String[] args) {


        // Create a variable called yourOrder , type String
        // and assign a value
        // Create another variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out.
        Scanner input = new Scanner(System.in);
        System.out.println("WHAT IS YOUR ORDER ? I WANT THE SAME!");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder + "\n" +
                "My order is " + myOrder);

    }

}
