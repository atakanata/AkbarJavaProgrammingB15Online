package office_hour;

import java.util.Scanner;

public class Practice_11_19 {

    public static void main(String[] args) {

// REPL 22 STEP BY STEP
//        * In this assignment you will write a program to create a shopping list and prices.
//
//                    You will use Scanner object and ask user to enter 3 items followed by
//                    *  its price and you will calculate total price and show as a report.
//
//                    -Declare 4 String variables item1, item2, item3, report.
        String item1, item2, item3, report;

//                    -Declare double variables price1, price2, price3, totalPrice
        double price1, price2, price3, totalPrice;

//                    -Create a Scanner object named scan.
        Scanner scan = new Scanner(System.in);
//                    Execution flow with example:
//
//                    -Display prompt "Enter Item1 and its price:"
        System.out.println("Enter Item1 and its price:");
//                    Tomatoes
        item1 = scan.next();
//                    5.5
        price1 = scan.nextDouble();
//                    -Display prompt "Enter Item2 and its price:"
        System.out.println("Enter Item2 and its price:");
//                    Cheese
        item2 = scan.next();
//                    3.5
        price2 = scan.nextDouble();
//                    -Display prompt "Enter Item3 and its price:"
        System.out.println("Enter Item3 and its price:");
//                    Apples
        item3 = scan.next();
//                    6.3
        price3 = scan.nextDouble();
//                    -calculate totalPrice for all items
        totalPrice = price1 + price2 + price3;
//                    -build the report variable by concatenating Strings and double values:

//                    "Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
        //"Total price: 15.3"
        report = "Item1: " + item1 + " Price: " + price1 +
                ", Item2: " + item2 + " Price: " + price2 +
                ", Item3: " + item3 + " Price: " + price3 +
                "\nTotal price: " + totalPrice;

//                    - Print the value of report variable
        System.out.println(report);


    }


}
