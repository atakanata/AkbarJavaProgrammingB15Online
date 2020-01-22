package office_hour.Practice_01_22_2020;

public class Toyota extends car {

    public static void main(String[] args) {
        Toyota car1 = new Toyota();
        car1.start();

        car car2 = new car();
        car2.start();

        Jeep car3 = new Jeep();
        car3.start();
    }

    @Override
    void start() {
        System.out.println("Push Button and start");

    }


}
