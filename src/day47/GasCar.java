package day47;

// this is called concrete class
// concrete class must provide body for all inherited abstract methods
// or it will not even compile
public class GasCar extends Car {

    int gasLevel;

    // implementing an abstract method in sub class means
    // providing body for teh method in sub class
    @Override
    public void start() {
        System.out.println("Gas car starting ");
    }

    @Override
    public void goForward() {
        System.out.println("Gas car going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas car turning " + direction);
    }


}
