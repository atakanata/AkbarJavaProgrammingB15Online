package office_hour;

import java.util.Scanner;

public class Practice_12_04 {

    public static void main(String[] args) {

        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 st word with single character to start with");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2 nd word with single character to end with");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);

        //   user enter  A for first part
        //   user enter C for second part
        // expected result should be A B C

        for (char iChar = firstAsChar; iChar <= secondAsChar; iChar++) {

            System.out.print(iChar + " ");

        }


        // OPTIONAL!!!!!

        // WHAT IF WE DONT WANT TO INCLUDE USERS STARTING AND ENDING POINT// ?
//        for(char iChar = (char)(firstAsChar+1) ; iChar < secondAsChar ; iChar++){
//
//            System.out.print( iChar + " ");
//
//        }


        //   user enter  D for first part
        //   user enter  A  for second part
        // expected result should be D C B A


    }


}
