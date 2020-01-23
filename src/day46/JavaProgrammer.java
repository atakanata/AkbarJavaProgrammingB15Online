package day46;

public class JavaProgrammer extends Programmer {


    @Override
    void code() {
        System.out.println("I code Java!!!");
//        super.code();
    }

    @Override
    void test() {

        super.test();
        System.out.println("WE DO TEST IN JUnit!!!");
    }

    public void drinkCoffee() {
        System.out.println("Java programmers drink lots of coffee");
    }

    public void doJavaDevelopment() {
        System.out.println("Java programmers do Java Development");
    }

}
