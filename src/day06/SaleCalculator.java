package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        /*
        * Day 6

        WAKE UP TASK :

        Create a program to calculate the final discounted price of an Item

        Create 3 double variables  called  regularPrice , salePrice and discount

        Ask user question using scanner for regularPrice and discountPercentage
        And save the result into the variable

        Calculate sale price using above information
        For example :  80 regular price , 0.2 for discount  , salePrice —>> 64

        Print out  : regular price is 80$ , discount is 0.2  and your got deal for 64 $
        *
        * */
        Scanner blabla = new Scanner(System.in);

        double regularPrice;
        double salePrice;
        double discount;

        System.out.println("What is the regular price ");
        regularPrice = blabla.nextDouble();

        System.out.println("What is discount rate ");
        discount = blabla.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println("regular price is " + regularPrice
                + "$ , discount is " + discount + "  and your got deal for " + salePrice + "    $");








    }


}
