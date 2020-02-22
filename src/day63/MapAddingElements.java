package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {

  public static void main(String[] args) {

    // CREATING HashMap objects
    Map<String, Integer> nameAgePair = new HashMap<>();

    // adding elements : put      ---> Map has Entry(Key Value Pair)
    nameAgePair.put("Zehra", 6);
    nameAgePair.put("Muhammed", 21);
    nameAgePair.put("Maiia", 27);
    nameAgePair.put("Aidar", 20);
    nameAgePair.put("Fatih", 15);
    nameAgePair.put("Ruhksona", 16);
    // The keys of the Map is unique ,it does not accept duplicate
    // here since we already have Zehra --> it will just replace the old value with new one
    nameAgePair.put("Zehra", 7);

    // HOW DO I ONLY ADD NEW ITEMS IF IT DOES NOT ALREADY EXISTS (java 8 addition)
    nameAgePair.putIfAbsent("Zehra", 10);

    System.out.println("nameAgePair = " + nameAgePair);
    // getting the size of a map
    System.out.println("nameAgePair.size() = " + nameAgePair.size());

    // how do we get an value according to the key
    System.out.println("Zehra's Age = " + nameAgePair.get("Zehra"));

    // how do i check a key already exist or not
    // containsKey method
    System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));
    System.out.println("nameAgePair.containsKey(\"HASAN\") = " + nameAgePair.containsKey("HASAN"));

    // Updating the element in the Map using replace
    nameAgePair.replace("Maiia", 17);
    System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
    // why don't we just use put ?? what is the downside ?
    // If I dont have that key , it will just add new one and that's not what we want , we only want to update

    // updating the value only if the old value equals to a specified value
    // update Zehra's age to 9 if it was 17
    nameAgePair.replace("Zehra", 7, 10);
    System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

    // Removing Entry  by the key
    nameAgePair.remove("Fatih");
    // try not to use get method to check you have the entry or not
    // because if you don't have the key you will get null
    // but you will also get null if the value was actually null -- {Fatih=Null}
    System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
    System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));


  }


}
