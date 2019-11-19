package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        /*
         *  Create a program to guess your favorite number
         *  create a variable called myFavoriteNumber as int
         *  Ask user to guess your favorite number
         *  if user guessed right  300  then print BINGO!!
         *  if not 300 print try again later
         *
         * */
        Scanner scan = new Scanner(System.in);

        System.out.println("GUESS MY FAVORITE NUMBER : ");
        int myFavoriteNumber = scan.nextInt();


        if (myFavoriteNumber == 300) {
            System.out.println("BINGO!!!!");
        } else {
            System.out.println("YOU ARE NOT MY BEST FRIEND , TRY AGAIN");
        }


    }


}
