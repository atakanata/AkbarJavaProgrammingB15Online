package day49;

// CAN A CLASS BOTH EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE?
//
public class IceCream extends Object implements Edible {


    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());

        // since Object class exists , we can create object out of it
        //Object o1 = new Object();

    }

    @Override
    public void eat() {
        System.out.println("eat with spoon !!!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }


}
