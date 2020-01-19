package day44;

public class Course {

    // there is only one value for this counter shared by all the objects
    static int counter;
    // each object will have their own name and type
    String name;
    String type;


    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        ++counter;
        // You can access static field
        // in constructor, instance method , static methods
    }


}
