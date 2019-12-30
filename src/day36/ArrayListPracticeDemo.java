package day36;

import java.util.*;

/**
 * @author : Akbar
 * Created At : 12/29/19
 */
public class ArrayListPracticeDemo {

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();
        //or
        //List<String> lst = new ArrayList<>();
        // adding items to the list
        //lst.add(String object)
        lst.add("Jon Snow");
        lst.add("Sansa Stark");
        lst.add("Arya Stark");

        //lst.add(index location to insert , String object);
        lst.add(1,"Bran Stark");
        lst.add(3,"Tony Stark");


        // to see what's inside array (yep , just print it out directly)
        System.out.println("Original lst = \n\t" + lst);

        //Counting the elements inside ArrayList
        //lst.size()
        System.out.println("lst.size() = " + lst.size());

        // checking whether it's an empty list or not
        //lst.isEmpty()
        System.out.println("lst.isEmpty() = " + lst.isEmpty());

        //Accessing the value of element at certain index
        //lst.get( index )
        System.out.println("\nfirst item lst.get(0) = " + lst.get(0));
        System.out.println("second item lst.get(1) = " + lst.get(1));
        System.out.println("last item of any ArrayList object \n\t lst.get(lst.size()-1) ="
                                + lst.get( lst.size()-1 ));

        //Replace the value of element at certain index
        //lst.set(index, newValue)
        lst.set(3,"Rob Stark");
        System.out.println("\nAfter replacing element with new value at index 3 lst = \n\t" + lst);

        //remove an element by it's value
        //lst.remove(elementToBeRemoved)
        lst.remove("Rob Stark");
        System.out.println("After replacing Rob Stark from the lst = \n\t" + lst);

        // remove an element by it's index
        //lst.remove(index);
        lst.remove(1);
        System.out.println("After removing element at index 1 lst = \n\t" + lst);

        // check if an element exists in the list
        //lst.contains( element )
        System.out.println("\nlst.contains(\"Rob Stark\") = " + lst.contains("Rob Stark") );

        // get the index of an element in the list
        //lst.indexOf(element) ;
        System.out.println("lst.indexOf(\"Arya Stark\") = " + lst.indexOf("Arya Stark") );

        // get the last index of an element in the list
        //lst.lastIndexOf(element) ;
        System.out.println("lst.lastIndexOf(\"Jon Snow\") = " + lst.lastIndexOf("Jon Snow") );

        System.out.println("\niterating over a list using for loop");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("\tlst.get(" + i + ") = " + lst.get(i));
        }

        System.out.println("\niterating over a list using for loop in reverse order ");
        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.println("\tlst.get(" + i + ") = " + lst.get(i));
        }

        System.out.println("\niterating over a list using for each loop");
        for (String each : lst) {
            System.out.println("\teach = " + each);
        }

        // removing all the items from the list
        //lst.clear();   // it will generate empty list and no way to get back elements

        // second way to create list object
        // by copying everything inside another list (yeah that simple)
        System.out.println("\nCopying everything in lst to lst2");
        ArrayList<String> lst2 = new ArrayList<>(lst);
        System.out.println("lst2 = " + lst2);

        // get an array out of your list by defining type and new array size.
        // if the array size is less than actual item count, it will correct itself
        // if array size is more than items count, it will fill up with null
        //lst.toArray(new String[0])

        System.out.println("\nGetting array out of lst");
        String[] arrOutOfList = lst.toArray(new String[0]);
        System.out.println("Array object we got from the list using lst.toArray(new String[0]) \n\t"
                                + Arrays.toString(arrOutOfList) );

        // turning your array into an List
        // this method will generate unmodifiable list
        //Arrays.asList(arr);

        //------- ANYTHING BELOW OPTIONALS ----------------
        //-------lst bulk operation -------
        // adding another list into the current list object
        //lst.addAll(another list)
        // remove all the item in the list if it exists in the another list
        //lst.removeAll(another list)
        // remove all the item in the list if it does not exists in the another list
        //lst.retainAll(another list)

        // Sorting an Array in ascending natural order
        lst.sort( Comparator.naturalOrder() );
        System.out.println("After Sorting in low to high (natural) order = \n\t" + lst);
        lst.sort( Comparator.reverseOrder() );
        System.out.println("After Sorting in high to low (reverse) order = \n\t" + lst);
        // DOES THIS WORK FOR ARRAY ? SURE IT DOES
        // overloaded version of sort method accept a comparator
        Arrays.sort( arrOutOfList,Comparator.reverseOrder() );


    }

}
