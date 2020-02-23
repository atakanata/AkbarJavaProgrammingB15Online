package day64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {


        // What if we want to have multiple value for one key ??
        // for example groupCode (bugHunter) -- group member names (abc, efg , htj , knl)
        // String         List<String>
        // key data type is String , value data type is List<String>
        Map<String, List<String>> groupMap = new HashMap<>();

        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("Achievers", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("BugHunter", Arrays.asList("Ayse", "Rabiyam", "Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona", "Fariza", "Seyma", "Sumeyyra", "Huvayda"));

        //System.out.println("groupMap = " + groupMap);

        groupMap.forEach((groupCode, allMembers) -> System.out.println("groupCode = " + groupCode + "\n\t members : " + allMembers));
        // get Toyly , he is at index 3
        System.out.println(groupMap.get("Achievers").get(3));
        // check whether this map has Gulzina or not in BugHunter ?
        // get method from Map | contains method is coming from list
        // because the values are List<String> get method will return the entire List
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));


    }


}
