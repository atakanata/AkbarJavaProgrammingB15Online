package day29;

import java.util.Random;

public class UsingRandomObjectToGetRandomNumber {

    public static void main(String[] args) {

        // There is a class called Random under java.util package
        // and it has methods to easily get random number within the range

        // just like scanner , first we need to import
        // import java.util.Random
        // Then create an Random Object and store assign it to a variable
        Random myRd = new Random();
        // call a method called nextInt(range)
        int randomNumber = myRd.nextInt(10);
        System.out.println(randomNumber);


    }

}
