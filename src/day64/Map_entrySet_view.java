package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {

    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        // Map is not iterable
        // in order to iterate over map , we need to get something iterable like set
        // Map store key value pair as Entry internally
        // and we can get this Entries out using  entrySet() view
        // so we can perform operation on key value pair together


        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        for (Map.Entry<String, Double> each : entryView) {

            // what can I do with data type Map.Entry?
            // getKey , getValue , setValue
            // useful when you are iterating over map using keySet view and make change at the same time
            System.out.println("Key for current Entry is " + each.getKey());
            System.out.println("Value for current Entry is " + each.getValue());
            // update the value of grocery to 10$ if the grocery name has exact 5 characters
            if (each.getKey().length() == 5) {
                each.setValue(15.0);
            }

        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);


    }

}
