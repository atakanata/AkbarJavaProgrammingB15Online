package day36;

import java.util.Arrays;

public class RefrenceTypeAndPrimitiveVariableCopying {

    public static void main(String[] args) {

        int x = 10;
        int y = x; // copying what's inside x , which is 10
        y = 100;   // changing the value of y tp 100
        System.out.println("x = " + x); // x does not change

        int[] nums = {1, 13, 4, 16, 3, 2};
        System.out.println("before changing nums = " + Arrays.toString(nums));
        // copying what's inside nums2 -->> The address
        // this address point to the same array object
        // just like having a dog with 2 leash
        // just like having a tv with 2 remote
        // just like 2 people calling you with 2 different nicknames
        // whichever variable you use to modify the object , it will change the object
        int[] nums2 = nums;
        nums2[0] = 100;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("after changing nums = " + Arrays.toString(nums));


    }

}
