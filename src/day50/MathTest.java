package day50;

public class MathTest {

    public static void main(String[] args) {


        Addition q1 = new Addition(10, 90);
        System.out.println("q1 before calc: " + q1);
        q1.calculate();
        System.out.println("q1 after  calc: " + q1);
        // The question type is Addition :  10+90 =

        Subtraction q2 = new Subtraction(90, 10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(10, 90);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 = " + q3);

        Multiplication q4 = new Multiplication(10, 3);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);


    }


}
