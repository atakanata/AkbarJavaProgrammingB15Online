package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);

//        lst.remove(3);
//        System.out.println("lst after removing index 3 item = " + lst);
//        lst.remove(2);
        // I want to remove item by it's value rather than index
        //       lst.remove( new Integer(2)  );
        lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);


    }

}
