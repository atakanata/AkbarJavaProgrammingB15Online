package day64;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {

    public static void main(String[] args) {

        // SortedMap extends Map and it will keep the sorted order
        // TreeMap is the implementation class

        // sort by natural order of the key data type
        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        // interview question :
        //      Difference between HashMap , LinkedHashMap , TreeMap
        // HashMap default implementation : faster . no insertion order , no sorted order
        // LinkedHashMap extends HashMap  : slightly slower , keep insertion order , no sorted order
        // TreeMap:SortedMap implementation : slowest , no insertion order , keep sorted order

        //      Difference between HashMap and HashSet

        // HashSet is implementation of Set interface
        // store unique elements per item
        // HasMap is implementation of Map interface
        // it store key value pair -- keys are unique
        // TWO COMPLETELY DIFFERENT DATA STRUCTURE


    }


}
