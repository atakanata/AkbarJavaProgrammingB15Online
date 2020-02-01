package day51;


//  a class    implements  an  interface
//  an interface   extends  another  interface
//  a class    extends   class


public class Drone implements UprightFlyable {


    @Override
    public void flyUpright() {
        System.out.println("Flying upright ");
    }

    @Override
    public void fly() {
        System.out.println("Flying regulartly ");
    }


}
