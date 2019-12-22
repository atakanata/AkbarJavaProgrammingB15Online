package day32;

public class NumberAction {

    public static void main(String[] args) {

        repeatString("Java", 3);
        repeatString("DO NOT TOUCH WORKING CODE", 10);


    }

    /**
     * * numberComparision
     * * this method has 2 parameters called num1 and num2
     * * if num1 is more than num2 print num1 is more than num2
     * * if num2 is more than num1 print num2 is more than num1
     * * if num2 are equals num1 print they are equal
     * *
     *
     * @param number1
     * @param number2
     */
    public static void numberComparision(int number1, int number2) {

        if (number1 > number2) {
            System.out.println("num1 is more than num2");
        } else if (number2 > number1) {
            System.out.println("num2 is more than num1");
        } else {
            System.out.println("they are equal");
        }
    }


    /**
     * Create static void methods as below
     *
     * String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     *
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     *
     *
     */

    /*
     * repeatString
     *  this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
           repeatString("Java", 3) -->> Java Java Java
    * */
    public static void repeatString(String strToRepeat, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();

    }


}
