package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

//        System.out.println( "1 x 1 = " + 1 * 1 );
//        System.out.println( "1 x 2 = " + 1 * 2 );
//        System.out.println( "1 x 3 = " + 1 * 3 );

//        System.out.println( "2 x 1 = " + 2 * 1 );
//        System.out.println( "2 x 2 = " + 2 * 2 );
//        System.out.println( "2 x 3 = " + 2 * 3 );
//        System.out.println("Multiplication table of 1 ");
//        for (int base = 1 ; base <= 12 ; base++) {
//            //System.out.println( "1 x 1 = " + 1 * 1 );
//            System.out.println( "1 x "+ base + " = " + 1 * base );
//
//        }
//        System.out.println("Multiplication table of 2 ");
//        for (int base = 1; base <= 12 ; base++) {
//
//            System.out.println( "2 x " +base+  " = " + 2 * base );
//
//        }
//
//        System.out.println("Multiplication table of 3 ");
//        for (int base = 1; base <= 12 ; base++) {
//
//            System.out.println( "3 x " +base+  " = " + 3 * base );
//
//        }

        /*
         * Plain english logic
         * write a code to generate multiplication table of 1 number
         * then repeat it 10 times to generate multiplication table from 1 - 10
         * */


        // this loop is for iterating number from 1 to 10 to get multiplication table
        for (int timesTable = 1; timesTable <= 10; timesTable++) {

            // I want to know which number i want to get the multiplication table
            System.out.println("Multiplication Table of " + timesTable);
            // this loop will generate multiplication table for one number
            for (int base = 1; base <= 12; base++) {

                System.out.println(timesTable + " x " + base + " = " + timesTable * base);

            }

        }


    }


}
