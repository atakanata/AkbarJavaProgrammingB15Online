package day56;

/**
 * Sometime we want to make a class that only generate single object
 * throughout the entire application
 * <p>
 * This is a design pattern called Singleton
 * It allows you to restrict the class to only have one object
 * -- add private static field with same type as class
 * -- add private constructor
 * -- add public method with return type same as class type
 */
public class Singleton {


    private static Singleton instance;

    private Singleton() {
        System.out.println("NO ARG CONSTRUCTOR BEING CALLED!!");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton(); // create object here
        } else {
            System.out.println("We already have this object"); // do not create object if already exists
        }

        return instance;

    }
}
