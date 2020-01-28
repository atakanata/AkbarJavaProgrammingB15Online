package office_hour.office_hour_01_28;

public abstract class Animal {

    //1. no object creation

    int age;


    //infomation --> variable

    //variables ==> local , instance , static
    String color;
    String breed;

    //default constructor
    public Animal() {

    }


    //Actions --> method
    //method --> instance , constructor

    //concrete method
    public void eat() {
        System.out.println("The animal is eating ");
    }

    public void call() {
        System.out.println("The animal is calling .. ");
    }


    //what if we just declare a method that should be in child class, and they have different
    //body

    //abstract method == I want this method will be appear in both cat
    //and dog classes , yet they should have dofferent body
    public abstract void run();

}
