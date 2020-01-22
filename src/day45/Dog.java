package day45;

public class Dog extends Animal {


    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();


    }

    @Override
    public void speak() {

        System.out.println("BARK!!!");

    }
}
