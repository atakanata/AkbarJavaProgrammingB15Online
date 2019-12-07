package day21;

public class NumberStairCase {

    /*
    *   1234	// count from 1 to 4
        1234	// count from 1 to 4
        1234	// count from 1 to 4
        1234	// count from 1 to 4
        1234	// count from 1 to 4

        do this 5 times
    * */
    public static void main(String[] args) {


        for (int x = 1; x <= 100; x++) {
            //System.out.println("x  :" + x );


            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();


        }

//        for (int y = 1; y <= 1 ; y++) {
//            System.out.print(y + " ");
//        }
//        System.out.println();
//
//        for (int y = 1; y <= 2 ; y++) {
//            System.out.print(y + " ");
//        }
//        System.out.println();
//
//        for (int y = 1; y <= 3 ; y++) {
//            System.out.print(y + " ");
//        }
//        System.out.println();
//
//        for (int y = 1; y <= 4 ; y++) {
//            System.out.print(y + " ");
//        }
//        System.out.println();
//
//        for (int y = 1; y <= 5 ; y++) {
//            System.out.print(y + " ");
//        }
//        System.out.println();
//
//
    }

}
