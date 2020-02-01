package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {


    public static void main(String[] args) {


        List<String> lst = new ArrayList<>();
        lst.add("Abc");


        List<Integer> lst2 = new ArrayList<>();
        lst2.add(12);
        lst2.add(10);
        lst2.add(11);
        lst2.add(1);
        lst2.add(100);

        Collections.sort(lst2);
        System.out.println("lst2 = " + lst2);


    }


}
