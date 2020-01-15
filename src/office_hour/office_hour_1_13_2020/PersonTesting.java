package office_hour.office_hour_1_13_2020;

public class PersonTesting {

    public static void main(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person();
        Person person3 = new Person();

        person1.firstName = "James";
        person1.lastName = "Bond";
        person1.DOB = "01/13/1980";

        person1.printInfo();

        person2.printInfo();
    }
}
