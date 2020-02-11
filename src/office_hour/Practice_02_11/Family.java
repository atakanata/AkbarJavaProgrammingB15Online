package office_hour.Practice_02_11;

public class Family {

    public static void main(String[] args) {
        //object
        Parent parent1 = new Parent();
        parent1.age = 35;

        System.out.println(parent1.name);
        System.out.println(parent1.age);

        Parent parent2 = new Parent();

        Parent parent3 = new Parent();
        parent3.age = 54;

        //how many ways I have to create object?
        Parent parent4 = new Parent("Ann", 45, 1234);

        Parent parent5 = new Parent("Unknow", -1, 3456);


    }
}
