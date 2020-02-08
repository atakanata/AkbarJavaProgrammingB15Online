package day55;

public class CalculatorTest {

    public static void main(String[] args) {

        SimpleCalculator c1 = new SimpleCalculator();
//        c1.addNum(100);
        c1.addNum(100)
                .addNum(200)
                .addNum(100)
                .minusNum(50)
                .displayFinalResult();

        ;
//        c1.result = - 10000 ;
//        System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);


    }

}
