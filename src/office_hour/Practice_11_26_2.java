package office_hour;

import java.util.Scanner;

public class Practice_11_26_2 {

    public static void main(String[] args) {

        /*
        * pseudo code :
        you have option to buy food or drink
        under food you can buy meal or snack
        under the drink you can buy soda or juice

        IF YOUR SELECTION IS FOOD

             WHAT KIND DO YOU WANT ? MEAL OR SNACK

       scanner version of the code
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("YOU WANT FOOD ? SAY FOOD IF YES ");
        String mainOptions = scan.next();      //"123";

        if (mainOptions.equalsIgnoreCase("food")) {

            System.out.println("You have selected food ");

            System.out.println("YOU WANT MEAL OR SNACK? ");
            String secondaryOption = scan.next();  // "ABC";


            if (secondaryOption.equalsIgnoreCase("snack")) {

                System.out.println("YOU HAVE SELECTED SNACK");

            } else if (secondaryOption.equalsIgnoreCase("meal")) {

                System.out.println("YOU HAVE SELECTED MEAL");

            } else {

                System.out.println("NO SUCH FOOD OPTION");

            }

        }


    }

}
