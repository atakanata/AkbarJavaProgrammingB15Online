package office_hour.office_hour_01_28;

public class Cat extends Animal {

    String eyeColor;

    public void call() {
        System.out.println("The cat is calling meow meow");
    }

    @Override
    public void run() {
        System.out.println("The cat is running ... ");
    }


    @Override
    public void sleep() {
        System.out.println("The cat is sleepng ");
    }
}
