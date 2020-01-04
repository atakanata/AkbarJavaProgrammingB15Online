package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        long[] myLongs = {6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swamp myLongs = " + Arrays.toString(myLongs));

        swampFirstAndLastValue(myLongs);
        System.out.println("After swamp myLongs = " + Arrays.toString(myLongs));


        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));

//        String str = "abc" ;
//        String str2 = null ;


    }

    /**
     * Swamp first and last value of long array
     *
     * @param nums long array
     */
    public static void swampFirstAndLastValue(long[] nums) {

        // just like swapping the tea in tea cup with coffee in coffee cup
        // yo uneed a temporary cup to hold you tea so you can put your coffee in
        // and put your tea back into coffe cup
        // nums[0]   , nums[ nums.length-1 ]
        long temp = nums[0];              // putting tea in the teacup to temp cup
        nums[0] = nums[nums.length - 1];  // putting coffee into tea cup
        nums[nums.length - 1] = temp;     // putting tea(in temp cup) into coffee cup


    }

}
