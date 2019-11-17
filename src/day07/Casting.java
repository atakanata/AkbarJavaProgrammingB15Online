package day07;

public class Casting {

    public static void main(String[] args) {

        //int num = 10 ;

        //int 10 is implicitly(automatically) converted to double 10.0
        // and stored inside bigNum behind scene

        double bigNum = 10;
        System.out.println(bigNum);

        // 12.99 is double , double has much bigger range than int
        // so it just does not fit
        //int num = 12.99 ;  // compiler error!!!!

        int num = (int) 12.99;
        System.out.println(num);

        // create a long variable and store int
        long earthToMoon = 10000; // --->> 10000L
        // create an int variable and try to store above long value
        int earthToMoonIn_blabla = (int) earthToMoon;

        System.out.println(earthToMoonIn_blabla);

    }


}
