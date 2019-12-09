package office_hour;

import java.util.Arrays;

public class Practice_12_09 {

    public static void main(String[] args) {
        int num = 9;
        num = 15;
        System.out.println(num);

        int[] nums = new int[4];
        nums[0] = 5;
        //I assign value of bun variable to 2 member of array
        nums[1] = num;
        nums[2] = 25;
        nums[3] = 22;
        //print info about array
        //toString() - method, that returns human readable information about array
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in array? " + nums.length);
        //when we want to get some value from array, we provide index
        //1 it's an index of seconds value in array
        System.out.println(nums[1]);
        //if I want to get last value from array
        //length returns number of values in array
        //length-1 - index of last value in array
        System.out.println("Last value in array: " + nums[nums.length - 1]);
        //how to find middle value?
        System.out.println("Middle value is: " + nums[nums.length / 2]);


        int[] newNums = new int[]{-45, 1, 3, 456, 4, 5, 7};
        System.out.println("Middle value is: " + newNums[newNums.length / 2]);
        //how to find biggest number?
        //let's infer that 1st value is the largest one
        int max = newNums[0];
        int secondMax = newNums[0];
        ;
        int min = newNums[0];
        for (int index = 0; index < newNums.length; index++) {
            //if any value is grater than current max
            if (newNums[index] > max) {
                //change max variable to this value
                max = newNums[index];
            }
            //same thing but we are excluding max number
            if (newNums[index] > secondMax && newNums[index] != max) {
                //change max variable to this value
                secondMax = newNums[index];
            }
            //how to find minimum value
            if (newNums[index] < min) {
                min = newNums[index];
            }
        }
        System.out.println("Max is : " + max);
        System.out.println("Second max is : " + secondMax);
        System.out.println("Min is : " + min);
    }

}
