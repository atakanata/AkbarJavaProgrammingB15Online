package day19;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown_Scanner {

    public static void main(String[] args) {

        // this is how we counted from 1 to 10

//        for(int i = 1 ; i <= 10 ; i++){
//
//            System.out.print(i + " " );
//
//        }
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();  // 15 ;
        int end = scan.nextInt();  // 29 ;


        System.out.print("you have started at speed-->>  ");
        for (int i = start; i <= end; i++) {

            System.out.print(i + ",");

        }


    }


}
