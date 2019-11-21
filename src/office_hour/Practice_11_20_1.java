package office_hour;

import java.util.Scanner;

public class Practice_11_20_1 {

    public static void main(String[] args) {

//        -Declare 4 String variables item1, item2, item3, report.
//                -Declare double variables price1, price2, price3, totalPrice
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
//                -Declare int variables count1, count2, count3
        int count1, count2, count3;
        //                -Create a Scanner object named scan.
        Scanner scan = new Scanner(System.in);
//                Execution flow using with example:
//
//        Use scanner to read all 3 values.
//
//                -Display prompt "Enter Item1, count and its price:"
        System.out.println("Enter Item1, count and its price:");
//        Tomatoes
        item1 = scan.next();
//        2
        count1 = scan.nextInt();
//        5.4
        price1 = scan.nextDouble();
//        Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
//
//
//        -Display prompt "Enter Item2, count and its price:"
//        Cheese
//        0
//        3.5
//        Explanation: (Item2 is "Cheese", count is 0, price is 3.5)
        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
//
//        -Display prompt "Enter Item3, count and its price:"
//        Apples
//        5
//        6.3
//        Explanation: (Item3 is "Apples", count is 5, price is 6.3)
        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

//        -calculate totalPrice for all items only if the item's count is more than 0!
        double totalPrice1 = price1 * count1;
        double totalPrice2 = price2 * count2;
        double totalPrice3 = price3 * count3;

        totalPrice = totalPrice1 + totalPrice2 + totalPrice3;

//        -build the report variable by concatenating Strings and double price values:
//        -do not include items that have count 0, use if statement !
//                -Calculate total price for the item and concatenate like below
        if (count1 > 0) {
            report = "Item1: " + item1 + " Price: " + totalPrice1;
        }
//        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
//        Explanation: (Item2 "Cheese" is not included since its count is 0)
//
//        - Print the value of report variable
//
//                - Print total Price:
//        "Total price: 42.3"


    }


}
