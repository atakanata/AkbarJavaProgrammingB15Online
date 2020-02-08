package day55.association;

public class TaxiAction {

    public static void main(String[] args) {


        Engine en = new Engine("V6", 400);
        Driver d = new Driver("Pedro", 12345);

        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1 = " + t1.toString());

        Taxi t2 = new Taxi(102,
                new Engine("V8", 600),
                new Driver("John", 12345));
        System.out.println("t2 = " + t2);


    }


}
