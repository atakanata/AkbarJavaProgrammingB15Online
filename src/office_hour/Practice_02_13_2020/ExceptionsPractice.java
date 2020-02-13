package office_hour.Practice_02_13_2020;

public class ExceptionsPractice {


    public static void main(String[] args) {

        String str = "Batch15";

        try {
            char ch1 = str.charAt(10);   // unchecked exception
            System.out.println(ch1);

        } catch (RuntimeException e) {  // we either give the specific exception class or its parent classes
            System.out.println("String index out of bound exception");
        }


        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        // int a = 9/0;

        System.out.println("Test Completed");


        printHello();


    }


    public static void printHello() {
        try {
            Thread.sleep(3000);
            System.out.println("Hello");
        } catch (Exception e) {

        }


    }


    /*

    Step 1
    step2
    step3
    step5
    step6


     */


}
