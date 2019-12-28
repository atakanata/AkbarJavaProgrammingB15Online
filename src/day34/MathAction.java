package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes
    public static void main(String[] args) {
        // call your build3DigitNumbers method here
        // build3DigitNumbers is under day34 package
        // and inside PracticeMethodWithNumbers class
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);
        // in order to use Arrays class
        //      that coming from java.util package (NOT YOUR PACKAGE)
        // first we need to import them import java.util.Arrays;
        // in order to call static method of Arrays class ,
        //      we need to use classname.methodName(...);
        //      here Arrays.toString(your array objects goes here )
        int[] nums = {2, 5, 87};
        System.out.println("Arrays.toString(nums)  = " + Arrays.toString(nums));
        // How can i call static method called calculate in Calculator_V2 under day31 package
        // first thing first , it's not under current package day34
        // so we need to import the class -->> import day31.Calculator_V2
        // in order to call static method of Calculator_V2 class ,
        //  Calculator_V2.yourStaticMethodName(....)
        Calculator_V2.calculate(10, 20, '-');

    }

}
