package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count  = " + productLst.size());
        System.out.println("\n-----------Task 3 ----------");
//         * Task 3 : print average price
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price; // sum += price ;

        }

        System.out.println("\n-----------Task 8 ----------");
//         * Task 8 : Count the items prices more than average price.

        System.out.println("\n-----------Task 9 ----------");
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.

        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

    }

}
