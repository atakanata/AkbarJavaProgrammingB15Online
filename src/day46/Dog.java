package day46;

public class Dog extends Animal {


    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();


    }
    // WHY DO WE WANT TO CALL SUPER CLASS VERSION OF OVERRIDDEN METHOD
    // We want to build on top of what's already written
    // code reuse
    // parent provide step abc
    // child want to do abc defg
    // so instead of repeating abc
    // child can directly call super class version of the method
    // to perform abc then add defg

    @Override
    public void speak() {
        // super. can be used to specify we are calling
        // super class version of the method
        // can we use super. or this. outside of instance method
        // BIG NO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // It can only be used inside instance method
        // we can use super. or this. as many time as we want
        super.speak();
        System.out.println("BARK!!!");
        super.speak();
        super.speak();

    }
}
