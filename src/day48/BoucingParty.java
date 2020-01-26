package day48;

public class BoucingParty {

    public static void main(String[] args) {


        Kangaroo b1 = new Kangaroo("Coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();
        b1.kickBox();

        // SuperType variableName = new SubType(....) ;  THIS WORKS
//        List<Integer> lst = new ArrayList<>();
        Bouncible k1 = new Kangaroo("Toto", 6);
        k1.bounce();


        Ball b2 = new Ball("Round", "Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();

        System.out.println(Bouncible.GRAVITY);

    }

}
