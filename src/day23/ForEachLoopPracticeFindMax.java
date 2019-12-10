package day23;

public class ForEachLoopPracticeFindMax {


    public static void main(String[] args) {

        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * Optionally :
         * use for each loop to find the max
         * use for each loop to find the sum
         *
         *
         *
         * */


        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there , I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead -->>> YES YOU CAN !!!

        /*
         * plain english logic to find max salary
         *
         *  write down the first number as temporarily max salary on a paper
         *  then go through each number and compare the number
         *   if the number you are comparing is more than what is on the paper
         *      delete that number and replace with bigger number
         *    keep doing this until you dont have any more number left.
         * */

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};
        long max = salaries[0];

        for (long salary : salaries) {
            // check the current salary is more than max
            if (salary > max) {
                // if so replace the existing value of max with current bigger salary
                max = salary;
            }

        }
        System.out.println("maxSalary = " + max);


        long[] salaries2 = new long[]{-100000L, -200000L, -150000L, -115000L, -60000L};
        long max2 = 0; //salaries[0] ;
        // YOU CAN NOT PICK SOMETHING THAT YOU DONT HAVE INSIDE ARRAY AS INITIAL VALUE


    }


}
