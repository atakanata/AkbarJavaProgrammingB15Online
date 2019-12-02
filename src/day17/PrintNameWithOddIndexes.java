package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME !!");
        String name = scan.nextLine();

        int x = 0;
        // x <= name .length()-1  meaning :
        // starting from 0 until last index

        // x < name .length()  meaning :
        // starting from 0 till right before the count of characters 


        while (x < name.length()) {  // x <= name .length()-1 )

            if (x % 2 == 1) {
                System.out.println(name.charAt(x));
            }
            ++x;
        }


    }


}
