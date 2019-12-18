package day29;

import java.util.Arrays;
import java.util.Random;

public class UsingRandomObjectToFillUpArray {

    public static void main(String[] args) {

        // There is a class called Random under java.util package
        // and it has methods to easily get random number within the range

        // just like scanner , first we need to import
        // import java.util.Random
        // Then create an Random Object and store assign it to a variable
        Random myRd = new Random();
        // call a method called nextInt(range)
        // this will generate random number from 0-10
        int randomNumber = myRd.nextInt(10);
        System.out.println(randomNumber);

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            // assigning random number from 0-100 each time
            numbers[i] = myRd.nextInt(100);
        }
        // run couple times and observe the result. you will get different array each time
        System.out.println("numbers = " + Arrays.toString(numbers));


    }

}
