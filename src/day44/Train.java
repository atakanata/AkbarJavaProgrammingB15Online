package day44;

// what is inherited from Super class

// fields and methods that visible in sub class are inherited
// constructors are not inherited

public class Train extends Vehicle {

    //    String make;
//    int year ; i
    int wagonCount;

    public static void main(String[] args) {


        Train t1 = new Train();
        t1.makeChoChoSound();
        // these attributes we got from Vehicle
        t1.make = "Thomas";
        t1.year = 1999;
        // calling the method we got from Vehicle
        t1.start();
        t1.goForward();

    }

    public void makeChoChoSound() {
        System.out.println("CHOOOO CHOOOO ");
    }


}
