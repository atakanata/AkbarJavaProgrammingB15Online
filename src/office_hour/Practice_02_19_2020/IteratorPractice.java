package office_hour.Practice_02_19_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {


    public static void main(String[] args) {


//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));

        Iterator<Integer> numIter = lst.iterator();
        // This iterator initially at the location right before your first element
        // (before-first-element location)

        // 3 methods available : hasNext() , next() , remove

        System.out.println("numIter.hasNext() to check if we have element at next position \n"
                + numIter.hasNext());

//        System.out.println("numIter.next() will move the pointer to the next element and get the value \n"
//                                    + numIter.next());

        //= Now time to iterate over using the iterator
        //  First thing first need to decide when we keep looping ?
        //      as long as we have next element  numIter.hasNext()
        //  How to move to the next and get the value
        //      numIter.next()
        while (numIter.hasNext()) {
            int x = numIter.next();
            if (x > 10) {
                System.out.println("current item  = " + x);
            }
        }


    }


}
