package day27;

public class ArraysTask02 {

    public static void main(String[] args) {
        /*
        Task02: write a program that returns the maximum number from an array
                    do not use sort method

         */
        int[] nums = {100, 10000, 9999, 8888, 1231, 2345};
        int max = nums[0]; //max: 10000

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        System.out.println("first max number: " + max);

        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (secondMax < nums[i] && nums[i] != max) {
                secondMax = nums[i];
            }
        }

        System.out.println("second max number: " + secondMax);


    }

}
