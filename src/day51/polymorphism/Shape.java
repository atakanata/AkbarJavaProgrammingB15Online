package day51.polymorphism;

public abstract class Shape {

    public abstract void draw();

}


class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING TRIANGLE");
    }
}


class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING RECTANGLE");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("DRAWING CIRCLE");
    }
}
