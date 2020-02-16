package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {


        // this the ArrayList constructor that accept any type of Collection object
        // public ArrayList(Collection<E> c) { }

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        // what is the best way to remove element while iterating over the collections
        // using the Iterator instead of for each loop / for loop / .....

        // iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()) {

//            System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }

        }
        System.out.println("nums = " + nums);
//        // hasNext() -->> check whether you have next item
//        System.out.println("myIter.hasNext() = " + myIter.hasNext() );
//        // next() -->> will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        System.out.println("myIter.next() = " + myIter.next() );
//        // removing whatever is the iterator is pointing to at this location
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next() );
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext() );


    }

}
