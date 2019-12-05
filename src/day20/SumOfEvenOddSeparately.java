package day20;

public class SumOfEvenOddSeparately {
//  Give me the sum of odd numbers and even numbers from
//  10 - 100 , use for loop

//// hint : create a variable sumOfOdd and sumOfEven as int
/// loop through 10-100
////  in each iteration check it's a even number or not
////    if it's add that number to sumOfEven
//        if not add that number to sumOfOdd
//
//    eventually after the loop -->> print out sum value

    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int money = 10; money <= 100; money++) {

            // if it's even number , add that to sumOfEven
            if (money % 2 == 0) {
                sumOfEven = sumOfEven + money;
                // if it's odd number , add that to sumOfOdd
            } else {
                sumOfOdd = sumOfOdd + money;
            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);


    }

}
