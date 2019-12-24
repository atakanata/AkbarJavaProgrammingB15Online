package day33;

import java.util.Scanner;

public class ReturnWillTerminateTheMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10 ");

        int num = scan.nextInt();
        if (num < 10) {
            // YOU CAN USE return Keyword to get out of the method
            // in void methods , as long as you don't actually return a value
            // below line is only thing you can do !!!
            return;
        }

        System.out.println("HAPPY HOLIDAYS ");
        System.out.println("2 DAYS OFF!!!! YAY");


    }

}
