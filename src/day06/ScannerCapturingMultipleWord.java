package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {
        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        // nextLine method of Scanner is used to capture whole line
        String name = blabla.nextLine();
        System.out.println("You have entered : " + name);

        System.out.println("which city you live in , including state ? ");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered City and State : " + cityAndState);

        System.out.println("What is your street address ? ");
        String streetAddress = blabla.nextLine();
        System.out.println("Your street address : " + streetAddress);




    }


}
