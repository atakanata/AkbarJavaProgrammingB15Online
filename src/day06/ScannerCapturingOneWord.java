package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");

        String name = blabla.next(); // it will only capture first word (separated by space)

        //String anotherWord = blabla.next();
        int age = blabla.nextInt();

        System.out.println("You have entered name " + name);
        //System.out.println("Another word is  " + anotherWord);
        System.out.println("You have entered age " + age);


    }


}
