package office_hour.Practice_02_04_2020;

public abstract class Device implements WaterProof {

    /*
    Pollymorphisim -->

    Samsung(child class) --> a device(super class) --> WaterProof(Interface)

     */

    int size;
    int price;

    public void call() {
        System.out.println("Calling with device ... ");
    }

    //abstract method

    public abstract void sendMessage();


}
