package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});
        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);

        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);

        compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1, names2);

    }

    // printArrayItems
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items : --->>> all the items here
    public static void printArrayItems(int[] nums) {

        System.out.println("arrays has items :" + Arrays.toString(nums));

    }
    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums) {

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("max = " + max);
    }
    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array
    public static void printMinOfIntArray(int[] nums) {

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum = sum + each;  //sum+=each ;
        }
        System.out.println("sum = " + sum);
    }

    /**
     * compare2arraySize
     * create a method that accept 2 String array object
     * and compare the item counts inside these 2 arrays
     * if arr1 is more then print array 1 has more item
     * if arr2 is more then print array 2 has more item
     * else print they have same item count
     */
    public static void compare2arraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }

    }
    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed


}
