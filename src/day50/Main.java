package day50;

public class Main {

    public static void main(String[] args) {


        Square s1 = new Square("my precious", 10);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = " + s1);
        s1.draw();


    }

}
