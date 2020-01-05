package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {

    public static void main(String[] args) {


        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        int locationOf34Value = lst2.indexOf(34);
        lst2.add(locationOf34Value + 1, 100);

        //lst2.add(   lst2.indexOf(34) + 1 ,  100  ) ;

        System.out.println("lst2 = " + lst2);
        // USE ADD METHOD
        // original -->  lst2 = [44, 14, 34, 100, 41, 19]
        // add five 100 in front of 44 : we know exactly 44 at index 0
        // output -->   lst2 = [100,100,100,100,100,100 , 44, 14, 34, 100, 41, 19]

//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
        for (int i = 1; i <= 5; i++) {
            lst2.add(0, 100);
        }
        System.out.println("lst2 = " + lst2);

    }


}
