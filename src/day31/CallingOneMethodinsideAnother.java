package day31;

public class CallingOneMethodinsideAnother {

    public static void main(String[] args) {

        finallyAwake();
        drinkCoffee();

    }

    public static void finallyAwake() {
        wakeUp();
        drinkCoffee();
    }

    public static void wakeUp() {
        System.out.println("Open your eye, only one");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("-----------------");
    }

    public static void drinkCoffee() {
        System.out.println("Put coffee in your coffee machine ");
        System.out.println("Press the button Make your coffee ");
        System.out.println("-----------------");
    }


}
