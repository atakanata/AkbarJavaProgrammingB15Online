package day12;

public class FizzBuzzTest {

    public static void main(String[] args) {

        int num = 45;

        if (num % 5 == 0 && num % 3 == 0) {

            System.out.println("FIZZ BUZZ NUMBER!");

        } else if (num % 5 == 0) {

            System.out.println("FIZZ NUMBER");

        } else if (num % 3 == 0) {

            System.out.println("BUZZ NUMBER");

        } else {
            System.out.println("NOT MY NUMBER!!!!");
        }


    }

}
/*
        * // TASK 3 :

        Create a class called FizzBuzzNumberCheck with main method
        Given a number  , create a variable int num

           If this number can be divided by 5 without remainder  lets print  it Fizz number
                  For example.  5 , 15 , 25 , 100
           If this number can be divided by 3 without remainder  lets print  it Buzz number
                  For example.  3 , 15 , 9 , 27
          If this number can be divided by both 3 and 5  lets print FizzBuzz Number
                 For example.   15 , 45 , 30 , 90

         If no match , just say  NOT MY NUMBER !!!!!!!

        * */

