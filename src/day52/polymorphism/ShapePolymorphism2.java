package day52.polymorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {

//        Circle  s1 = new Circle("penny",5);
        Shape s1 = new Circle("penny", 5);
        printAnyShapeArea(s1);
        Shape s2 = new Rectangle("Book", 10, 5);
        printAnyShapeArea(s2);
        // here we are directly passing the sub class object
        // to a method that have Shape as parameter type
        printAnyShapeArea(new Square("Bob", 6));

        drawShape3Times(s2);
        drawShape3Times(s1);
        drawShape3Times(new Square("Bob", 6));


    }


    // Create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape) {

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();

    }


    // create a method that accept any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape) {
//        Shape anyShape = s1;
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is = " + anyShape.area);

    }


}
