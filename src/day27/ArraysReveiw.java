package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReveiw {

    /* Array: a vriable that allows us to store multiple values

                Array's size is fixed

            decleration:
                        Data-Type[] variableName = {data1, data2, ...};
                       each elemnt's data-type is same with Array's data type

            regular variables:
                    we can only store one single value
                        int a = 10;

            array variables:
                    int[] arr ={ 1, 2,  3 };
                    index:       0   1  2

                retrieve data:
                    arrayName[indexNumber] ==> elemnt of that index number
                    EX:
                        arr[2] ==> 3


               Array MUST be converted to String in order to be printed

                Array's size is fixed, must be initialized before we use it


    */

    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10, 20, 30, 40, 50, 60};
        // length: returns the total number of elements from the array
        // last index num: arr.length-1
        int num1 = arr[arr.length - 1];
        //               6      -    1   = 5
        System.out.println(num1);
        System.out.println("===================================");

        // expected: 10 20 30 40 50 60
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("\n===================================");

        // Arrays.toString(VariableName):
        String str = Arrays.toString(arr);
        System.out.println(str);


        /* Task01:
            write a program that asks user to enter a number 5 times,
             and store those number into array

             print the largest number

         */
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an int number: ");
            //  int input = scan.nextInt();  // returns int data type
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        // Arrays.sort(variableName): sorts the array in ascending order
        Arrays.sort(numbers);

        int largetsNumber = numbers[numbers.length - 1];
        int minNumber = numbers[0];
        System.out.println("Largest number is: " + largetsNumber);
        System.out.println("Minimum number is: " + minNumber);


    }
}
