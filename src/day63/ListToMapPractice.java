package day63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {

    public static void main(String[] args) {

        /*
        * Abraham Hope
        	Zeliha Sezer
        	Onuralp Dursun
        	Tugba Bekar
        	Birnigar Ozyurt
        	Seda Civan
        	Nuran Demir
        	Murat Kilinc
        	Hakan Durmus
        	Mariia Lukianenko
        * */

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");

        Map<String, Integer> nameCharCountPair = new HashMap<>();

        for (String eachMember : names) {
            nameCharCountPair.put(eachMember, eachMember.length());
        }

        System.out.println("nameCharCountPair = " + nameCharCountPair);


    }

}
