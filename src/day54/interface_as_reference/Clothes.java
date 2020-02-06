package day54.interface_as_reference;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        // try out all the polymorphic assignment
        // according to these relationship

    }


}

class Watch implements Wearable {

}

class Perfume implements Wearable, Cosmetics {

}

class Makeups implements Wearable, Cosmetics {

}

