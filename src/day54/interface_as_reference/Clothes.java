package day54.interface_as_reference;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        // try out all the polymorphic assignment
        // according to these relationship
        Clothes c1 = new Clothes();
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();
        //-------------------------
        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch();
        // -------------------------
        Perfume p1 = new Perfume();
        Wearable w3 = new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3 = new Perfume();

        Makeups m1 = new Makeups();
        Wearable m2 = new Makeups();
        Cosmetics m3 = new Makeups();
        Object o4 = new Makeups();


    }


    @Override
    public void wear() {
        System.out.println("Wearing Clothes!!");
    }
}

class Watch implements Wearable {

    @Override
    public void wear() {
        System.out.println("Wearing Watches!!");
    }
}

class Perfume implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!");
    }
}

class Makeups implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing Makeups!!");
    }
}

