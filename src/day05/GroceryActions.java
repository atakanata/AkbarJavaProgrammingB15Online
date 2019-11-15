package day05;

import java.util.Scanner;

public class GroceryActions {

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
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the price for potato");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many you want to buy ?");
        int potatoCount = scan.nextInt();
        float potatoTotal = potatoPrice * potatoCount;
        System.out.println("Your total for potato is " + potatoTotal);

        System.out.println("what is the price for tomato");
        float tomatoPrice = scan.nextFloat();
        System.out.println("How many you want to buy ?");
        int tomatoCount = scan.nextInt();
        float tomatoTotal = tomatoPrice * tomatoCount;
        System.out.println("Your total for tomato is " + tomatoTotal);

        System.out.println("what is the price for banana");
        float bananaPrice = scan.nextFloat();
        System.out.println("How many you want to buy ?");
        int bananaCount = scan.nextInt();
        float bananaTotal = bananaPrice * bananaCount;
        System.out.println("Your total forr potato is " + bananaTotal);

        System.out.println("You got " + tomatoCount + " tomatos, the price is " + tomatoPrice
                + " and the total is $" + tomatoTotal);

        System.out.println("You got " + potatoCount + " potatoes , the price is " + potatoPrice
                + " and the total is $" + potatoTotal);

        System.out.println("You got " + bananaCount + " bananas , the price is " + bananaPrice
                + " and the total is $" + bananaTotal);

        System.out.println("Your grand total for this shopping is $" +
                (tomatoTotal + potatoTotal + bananaTotal));


    }
}