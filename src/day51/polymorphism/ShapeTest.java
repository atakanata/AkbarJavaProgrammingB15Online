package day51.polymorphism;

public class ShapeTest {

    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();


    }


}
