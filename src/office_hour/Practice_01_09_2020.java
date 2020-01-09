package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_01_09_2020 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        List<Integer> list = new ArrayList<>();
        list.add(10); //autobox    [10]

        list.add(20); //autobox  [10,20]

        list.add(1, 30); // [10, 30, 20 ]

        System.out.println(list.size()); //2

        int num = list.get(1);  // unboxing
        System.out.println(num);  //30

        list.clear(); // []
        System.out.println(list.size()); //0

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.set(0, "B");

        System.out.println(list2);

        boolean result = list2.contains("C");
        System.out.println(result);

        System.out.println(list2.isEmpty());  //false

        System.out.println(list2.indexOf("B"));      //0
        System.out.println(list2.indexOf("D")); //-1, the gievn object is not exist in arrayList

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        //[1, 2, 3]

        // int a1= 1 ;
        Integer a2 = 1;

        //list3.remove(a1); // [1,3]
        boolean r1 = list3.remove(a2);  // [2, 3]

        System.out.println(list3);
        System.out.println(r1); // true, 1 was removed from the arraylist


        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");

        //      [A, B, C, D]

        // list4.remove(2); //[A, B, D]
        list4.remove("B"); //[A, C, D]
        System.out.println(list4);


        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        List<Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);

        String[] students = {"Nursultan", "Irina", "Dilshat", "Roksana"};
        List<String> names = new ArrayList<>(Arrays.asList(students));
        //  names.addAll(  Arrays.asList(students) );
        names.addAll(Arrays.asList("Mohammad", "Bulent", "Mustafa"));

        System.out.println(names);


        List<String> grades = new ArrayList<>();
        grades.addAll(Arrays.asList("A", "B", "A", "C", "D", "E", "F"));

        grades.removeAll(Arrays.asList("A", "C"));

        System.out.println(grades); //[B, D, E, F]


        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Corolla", "BMW", "Jaguar", "Honda", "Tesla", "BMW"));

        // remove all the cras that are not BMW, or Jaguar, or Tesla
        cars.retainAll(Arrays.asList("BMW", "Jaguar", "Tesla"));

        System.out.println(cars);

      /*
      give name list: Ahmet, John, Ahmet, Eric, Aaron

       */

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet"));


        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmet"));
        System.out.println(employees);


        List<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet"));

        employees2.retainAll(Arrays.asList("Ahmet"));

        System.out.println(employees2);


        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Collections.sort(nums2);

        System.out.println(nums2);


        /*
   class notes
        01/09/2020
Practice Topics: ArrayList
				 Array VS ArrayList

ArrayList class:
		1. presented in "java.util"
		2. ArrayList only supports non primitives
		3. ArrayList's size is automatically Adjusted (dynamic)
		4. does have index number

Array vs ArrayList:
		1. arraylist only suppurts non primitives, array supports all
		2. arraylist' size is dynamic, array's size is fixed

decleration:
	1. ArrayList<ObjectType> list = new ArrayList<>();
	2. List<ObjectType> list = new ArrayList<>();


ArrayList methods: add, get, size, clear, set, contains, equals, IsEmpty, indexof, remove, addAll, RemoveAll, sorting

		add(Object): adds the given objects to the list

		add(index, Object): inserts the given object to the given index

		size(): returns the total number of the object

		get(int index): gets the objects from the given index, retruns object

		clear(): remeovs all the objects from the list, size of list will be 0

		set(index, Object): the object at the index number will be replaced with the given object

		contains(Object): checks if the given object is exist in the list. returns boolean

		equals(List): checks if the two list have same object or not

		isEmpty(): checks if the arraylist's size is 0. retruns boolean

		indexOf(Object): returns the index number of the given object, returns primitive int

		remove(int index): removes the given index number

		remove(Object): removes the first matching object of the arrayList, returns boolean value

		addAll(CollectionType): adds the bcollections of objects to the List

		removeAll(CollectionType): removes all the matching objects from list

		retainAll(CollectionType): removes all the not matching objects from list


Converting Array to List: ONLY THE NONE PRIMITIVE ARRAY CAN BE CONVERTED TO LIST
		Arrays.asList(data collection): returns the data collections as List interface(Collection framework)

		String[] arr = {"A", "B"};

	List<String> list = new ArrayList<>( Arrays.asList(arr) );


sort arrays:
	Arrays.sort(ArrayName);


sorting List:
	Collections.sort(CollectionTypeName);

	Collections class is presented in Java.Util







         */


    }


}
