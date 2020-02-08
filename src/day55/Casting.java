package day55;

public class Casting {

    public static void main(String[] args) {


        int x = 10;

        long y = x; // it works implicitly | automatically

//        byte b = x ;

        byte b = (byte) x; // need to be casted explicitly
        // polymorphism
        Object o = new Dog("Chiwava"); // this is upcasting from type Dog to Object
//        o.bark();
        //Dog d =  new Dog("ashjgdashjdgahjsgdahjsg") ;  //this is new object
        Dog d = (Dog) o; // this is downcasting from type Object to Dog
        d.bark();

        // Creating object with Object reference
        Object o2 = new Object();
        // compile fine because Dog IS-A Object , BUT CLASS CAST EXCEPTION AT RUNTIME
        // Because d2 = new Object() will NOT WORK!!!
        Dog d2 = (Dog) o2;
        d2.bark();


    }


}
