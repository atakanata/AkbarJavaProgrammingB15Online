package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {


    public static void main(String[] args) {

        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK !!");

        String password;

        do {
            System.out.println("WHAT'S THE PASSWORD ? ");
            password = scan.next();

        } while (!password.equals("B15"));

        System.out.println("DOOR IS OPEN!!!!");


    }

}
