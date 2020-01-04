package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

//        C.R.U.D.
//                Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList object
        System.out.println("\nFirst item is : lst.get(0) = " + lst.get(0));
        System.out.println("Second item is : lst.get(1) = " + lst.get(1));
        System.out.println("Third item is : lst.get(2) = " + lst.get(2));
        System.out.println("Fourth item is : lst.get(3) = " + lst.get(3));

        for (int x = 0; x < lst.size(); x++) {

            System.out.println(" item " + lst.get(x));

        }
        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0;
        for (int x = 0; x < lst.size(); x++) {
            sum = sum + lst.get(x); // x in here is index , so it's data type int
        }
        System.out.println("sum = " + sum);


        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("max = " + max);

    }
}
