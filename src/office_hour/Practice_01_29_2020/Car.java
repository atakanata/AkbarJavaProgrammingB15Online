package office_hour.Practice_01_29_2020;

import java.util.Arrays;
import java.util.List;

public class Car {

    String brand;
    // Car has Engine , so we are using Engine as instance variable data type
    Engine e;
    // I want car object has passenger names attacted to it
//    String[] passengers;

    List<String> passengers;    // =  new ArrayList<>();

    public static void main(String[] args) {

        Car c1 = new Car();
        // there is 2 ways to create String object
        // and we are using new keyword by choice
        c1.brand = new String("Toyota");  //"Toyota" ;
        c1.e = new Engine("V6", 270);
//        c1.passengers = new String[]{ "Ziyoda","Aykokul","Mehtap","Rauf"};
        c1.passengers = Arrays.asList("Ziyoda", "Aykokul", "Mehtap", "Rauf");

        System.out.println("c1 = " + c1);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e.toString() +
                ",passengers= " + passengers +
//                ",passengers= " + Arrays.toString(passengers) +
                '}';
    }
}
