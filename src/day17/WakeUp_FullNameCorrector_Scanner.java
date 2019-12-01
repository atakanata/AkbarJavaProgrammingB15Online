package day17;

import java.util.Scanner;

public class WakeUp_FullNameCorrector_Scanner {

    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR FULL NAME IN 2 WORDS");
        String fullName = scan.nextLine();
        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0, indexOfSpace); // arYa
        String lastName = fullName.substring(indexOfSpace + 1);   // sTarK


        String firstNameCorrected =
                firstName.toUpperCase().substring(0, 1) +  // ARYA -->> A
                        firstName.toLowerCase().substring(1);    // arya --->> rya

        System.out.println(firstNameCorrected);

        String lastNameCorrected =
                lastName.toUpperCase().substring(0, 1) +
                        lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);


    }

}
