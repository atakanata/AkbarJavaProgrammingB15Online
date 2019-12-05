package day20;

public class SumOfOdd {
//  Give me the sum of odd numbers from
//  10 - 100 , use for loop

//// hint : create a variable sum as int
/// loop through 10-100
////  in each iteration check it's a odd number or not
////  if it's add that number to sum
//
//    eventually after the loop -->> print out sum value

    public static void main(String[] args) {


        int sum = 0;
        for (int x = 10; x <= 100; x++) {

            // if( x % 2 != 0 ){
            if (x % 2 == 1) {
                //System.out.println(x);
                sum = sum + x;  // sum += x;
            }

        }

        System.out.println("sum = " + sum);


    }

}
