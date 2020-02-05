package office_hour.Practice_02_04_2020;

public class IPhone extends Device {

    String platform;

    @Override
    public void sendMessage() {
        System.out.println("Hi from IPhone ");
    }

    public void FaceTime() {
        System.out.println("Talking to Akbar through face time");
    }

    public void call() {
        System.out.println("Calling with IPhone ");
    }
}
