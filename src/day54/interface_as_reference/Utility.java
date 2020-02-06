package day54.interface_as_reference;

public class Utility {


    public static void main(String[] args) {


        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Makeups();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        // here directly passing the object without storing into a variable
        wearMyWearable(new Watch());
//        wearMyWearable(  new String()  ); String is not a Wearable

        String result1 = getMyString();
        System.out.println("result1 = " + result1);


        System.out.println("\n ----calling the getMyWearableObject--- \n");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());
        wearMyWearable(result);


    }


    // create a static method called getMyWearableObject
    // it return a Wearable object (or anything IS-A Wearable)

    public static Wearable getMyWearableObject() {

//        Wearable w = new Clothes();
//        return w ;

//        return new Clothes() ;
        return new Watch();
//        return new Perfume() ;
//        return new Makeups() ;

    }

    public static String getMyString() {

//        String str = new String("bla bla ") ;
//        return str ;
//
        return new String("bla bla ");

    }

    // create a static void method wearMyWearable
    // it has 1 parameter with type Wearable
    // we made it static so we can just call it directly
    public static void wearMyWearable(Wearable any) {
        any.wear();
    }


}
