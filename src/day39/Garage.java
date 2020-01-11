package day39;

public class Garage {

    public static void main(String[] args) {


        // Create car object using Class
        // or
        // Get an instance of Car class

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "4 Runner";
        car1.color = "white";
        car1.year = 2020;
        car1.goForward();

        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);

        System.out.println("-----------");

        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        car2.goForward();
        System.out.println("car2.make = " + car2.model);
        System.out.println("car2.color = " + car2.color);

        car2.year = 2020;
        System.out.println("car2 year = " + car2.year);

        // I WANT TO CHANGE THE COLOR OF Hyundai TO THE COLOR OF Toyota
        car2.color = car1.color;  //car2.color = "white" ;

    }

}
