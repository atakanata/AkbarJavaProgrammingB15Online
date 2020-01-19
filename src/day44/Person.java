package day44;

public class Person {

    // static field : belong to the class (type itself)
    // there is only one copy of this value shared by all the objects
    // created out of this Person template|blue print
    public static String species;
    private String name;
    // instance field : belong to the instance(object)
    // every Person object will get their own name and age
    // changing the value of one object does not affect another
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
