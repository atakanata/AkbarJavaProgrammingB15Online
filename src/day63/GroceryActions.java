package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryActions {


    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);
        groceryPriceMap.putIfAbsent("Apple", 100.0);

        System.out.println("groceryPriceMap.size() = " + groceryPriceMap.size());
        System.out.println("groceryPriceMap = " + groceryPriceMap); // NO ORDER WHEN PRINTING (RANDOM ORDER)

        System.out.println("groceryPriceMap.get(\"Tomato\") = " + groceryPriceMap.get("Tomato"));

//        groceryPriceMap.replace("Apple", 1.89*2) ;
        groceryPriceMap.replace("Apple", groceryPriceMap.get("Apple") * 2);
//        double newPrice =  groceryPriceMap.get("Apple") *2 ; // get the apple price and double it
//        groceryPriceMap.replace("Apple", newPrice ) ;

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));
        // try to reduce the banana price by 1 dollar
        groceryPriceMap.replace("Banana", groceryPriceMap.get("Banana") - 1);
        System.out.println("groceryPriceMap.get(\"Banana\") = " + groceryPriceMap.get("Banana"));

        if (groceryPriceMap.containsKey("Tomato")) {
            groceryPriceMap.remove("Tomato");
            System.out.println("NO MORE TOMATO!@");
        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }


}
