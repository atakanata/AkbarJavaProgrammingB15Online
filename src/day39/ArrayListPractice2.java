package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

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

        System.out.println("\n-----------Task 7 ----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR

        // First we need to find out the element that contain word Dyson in the list
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            // checking the element start with dyson
            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i; // if so set the dysonIndex to that location
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        // This is original dyson details using the index
        String dysonDetails = productLst.get(dysonIndex);
        // in order to get 80% off the price and put it back to list
        // we need the price and monthly in double format so we can do calculation
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        // Putting it back to the dysons details after doing the calculation
        // 80% off means you are paying for 20% of original price
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        // then use the set method to set the value back to the list
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);



    }

}
