package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_valuesView2 {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Collection<Double> allPrices = groceryPriceMap.values();

        // remove all entry of the groceryPriceMap if the price value is more than 3

//        allPrices.removeIf( eachPrice-> eachPrice>3);
//        System.out.println("groceryPriceMap = " + groceryPriceMap);

        // The logic is to use the strict connection between the view and the original map
        // iterate over the allPrices and check the condition for more than 3 or not
        // if it is more than 3 then remove
        // CAN NOT REMOVE ELEMENTS INSIDE FOR EACH LOOP
        // SO ONLY OPTION OTHER THAN removeIf method is to use Iterator
        Iterator<Double> itr = allPrices.iterator();
        while (itr.hasNext()) {
            if (itr.next() > 3) {
                itr.remove();
            }
        }

        System.out.println("groceryPriceMap = " + groceryPriceMap);


    }

}
