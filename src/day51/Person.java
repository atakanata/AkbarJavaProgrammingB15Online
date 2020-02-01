package day51;

// Person IS-A Comparable
// yes because it implements Comparable interface
// it's a inheritance | IS-A | Super-Sub relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // now this become a natural order for comparing Person Object
    @Override
    public int compareTo(Person otherPerson) {

//        if (this.age > otherPerson.age) {
//            return 1;
//        } else if (this.age < otherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//        }
        // modify this method to make your natural order , comparing by name (first character)
        // then use it with sort method
        return 0;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
