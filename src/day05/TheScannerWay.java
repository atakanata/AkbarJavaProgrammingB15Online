package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        // ask user for name
        // and capture the result
        // print your name is is
        // ask user for birth year
        // and capture the result
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height !!

        // Create scanner object
        // you can name your variable whatever you want
        // in below case we are calling it scan
        // Scanner is data type , scan is the name ,  new Scanner(System.in) is the value
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        //String name = "Sam" ;
        String name = scan.next();
        System.out.println("Your name is  " + name);

        System.out.println("What is your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println("Your age is : " + age);

        System.out.println("what is your height ? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height);


    }

}
