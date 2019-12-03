package office_hour;

import java.util.Scanner;

public class Practice_12_02_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //          01234567890
//        String name = "Arya Stark" ;
        String name = scan.nextLine();
        // getting each character using charAt(index)
        // generate sequential number 0 --> 10


        // is there any chance that while loop does not execute
        int x = 0;

        while (x < name.length()) {

            System.out.print("index: " + x);
            System.out.println(name.charAt(x));
            ++x;

        }


//        while( x < 15){
//            System.out.println("WOLA@");
//        }
//        System.out.println("THE END ");


    }


}
