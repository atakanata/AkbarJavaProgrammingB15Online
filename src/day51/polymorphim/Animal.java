package day51.polymorphim;

public class Animal {

    public void makeNoise() {
        System.out.println("general animal noise");
    }


}

// I can add more classes as long as only one class is public and name is same as file name .

class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("WOOF!!!!!");
    }

}


class Horse extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("NEINEI!!!!!");
    }


}
