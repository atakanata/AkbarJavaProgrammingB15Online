package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {


        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[] nums = {10, 40, 20};
        // how do i change double my first item in the array
        //       nums[0] = nums[0] * 2 ;   // nums[0] *= 2 ;
        //      System.out.println(nums[0]);

        for (int x = 0; x < 3; x++) {
            //System.out.println( nums[x] *2 );  JUST PRINTING WONT CHANGE THE VALUE
            long eachItem = nums[x];
            eachItem = 100;
            //nums[x] = nums[x] * 2 ;  // here we are doubling the value of each item
        }


        for (long eachItem : nums) {
            eachItem = 100;
        }
        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS

        // how do i know array items are modified or not  re-print

        System.out.println("AFTER WE MODIFY THE VALUE ");
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }


    }

}
