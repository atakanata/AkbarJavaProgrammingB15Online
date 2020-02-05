package office_hour.Practice_02_04_2020;

public class TestDevice {

    //device --> Samsung --> Waterproof
    //           IPhone

    public static void main(String[] args) {
        // references : d ,s ,i
        //objects :   new Device() ,  new Samsung(), new IPhone()

        //  Device d = new Device();

        //what is pollymorphism ?
        // reference(d2) type parent class/ Interface
        //object(new Samsung() type is child class

        //2 types pollymorphesim -->
        //1. Dynamic == method overRiding
        //2.static  == method overLoading

        //reference type decides what to access

        Device d2 = new Samsung();
        //d2 does not have access any variable or method which is
        // created in Samsung
        d2.price = 888;
        d2.size = 6;
        //   d2.color
        //  d2.takePicture()

        WaterProof w = new Samsung();
        //w does not have access for any variable or methods
        // in Device or Sumsang

        System.out.println("d3 =====");
        //d3's type is device == d3 can HAVE ACCESS ONLY variable + methos in Device
        Device d3 = new IPhone();
        d3.size = 8;
        d3.price = 374;
        d3.call(); //this method will be called from Device

        //  d3.call(); --> after you have call() in Iphone calss, it calles from iphone class
        //you can not use anything from IPhone

        System.out.println("i2 ====");

        IPhone i2 = new IPhone();
        i2.price = 1000;
        i2.size = 5;
        i2.platform = "IOS";
        i2.FaceTime();
        i2.call(); //after wirte call() in IPhone calss, this method will be called from Iphone


        Samsung s = new Samsung();
        s.takePicture();
        s.price = 999;
        s.size = 7;
        s.color = "Black";


        s.call();
        s.sendMessage();

        System.out.println("==============");
        IPhone i = new IPhone();
        i.call();
        i.sendMessage();


    }


}
