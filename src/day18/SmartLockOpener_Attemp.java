package day18;

import java.util.Scanner;

public class SmartLockOpener_Attemp {

    public static void main(String[] args) {


        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK !!");
        System.out.println("WHAT'S THE PASSWORD ? ");

        // entering password for the first time
        String password = scan.next();
        int attemptCount = 1;

        while (!password.equals("B15")) {

            System.out.println("You attempt count is : " + attemptCount);
            if (attemptCount == 3) {
                System.out.println("LOCKED OUT !!!!!!!");
                return; // this is used to exit from the method here!!!
            }

            System.out.println("WRONG PASSWORD!! TRY AGAIN!!");
            password = scan.next();
            ++attemptCount;

        }

        System.out.println("OPEN SESEAME !!!");


    }


}
