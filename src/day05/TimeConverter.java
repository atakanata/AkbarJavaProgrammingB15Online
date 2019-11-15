package day05;

import java.util.Scanner;

public class TimeConverter {
    /*
    Task 3 :
    *  Create an interactive program to ask user for day count
    *  and generate minute that day have
    * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" How many days are you going to drive ? ");
        int workDay = scan.nextInt();
        int minute = workDay * 60 * 24;
        System.out.println(" Your going to drive for " + minute + " minutes ");

    }
    /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */

    /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */

    /*
    Task 6 :
       *
       *

       */


}
