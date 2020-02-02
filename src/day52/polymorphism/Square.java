package day52.polymorphism;

public class Square extends Shape {

    //    String name;
//    double area;
    int length;

    public Square(String name, int length) {
        super(name); // reusing functionality of super class
        this.length = length;
    }


    @Override
    public void calculateArea() {
        area = length * length; // this is how we calculate area of square
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with 90 degree , length "
                + length + " with color " + COLOR); // Drawable.COLOR
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    //    public abstract void calculateArea();
//    public abstract void draw();


}
