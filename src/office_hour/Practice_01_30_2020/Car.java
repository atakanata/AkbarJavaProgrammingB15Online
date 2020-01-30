package office_hour.Practice_01_30_2020;

public abstract class Car {
    // public abstract return-type  methodName();

    public abstract void start();


}

class Toyota extends Car {

    @Override
    public void start() {
        System.out.println("Push Button");
        System.out.println("Start Engine");
    }

}

class Jeep extends Car {

    public void start() {
        System.out.println("Call Machanic");
        System.out.println("Oil change");
        System.out.println("Start engine");
    }

}

abstract class ElectricCars extends Car {

    public abstract void HasBattery();
    // there 2 abstract methods: start(), HasBattery()

}

class Tesla extends ElectricCars {
    @Override
    public void start() {
        System.out.println("say start");
        System.out.println("star engine");
    }

    @Override
    public void HasBattery() {
        System.out.println("Tesla has Battery");
    }

}


class Test {
    public static void main(String[] args) {
        Jeep obj1 = new Jeep();
        obj1.start();

        System.out.println("========================================");

        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println("========================================");

        Tesla obj3 = new Tesla();
        obj3.start();
        System.out.println("========================================");

        //  Car obj4 = new Car(); // abstract calss is not concrete we cannot create object


    }
}
/*
01/30/2020
Practice Topic: OOP Abstraction

abstract: not concrete

abstraction: focusing on the importance/ Essentials, without worrying the implementation
				hiding the implemtation/functionality details

		class car{
			start();
		}

		class Tesla extends car{
			start(){
				say"start"
				start engine
			}
		}

		class Toyota extends car{
			start(){
				push button
				start engine
			}
		}

		class Jeep extends car {
			start(){
				call the machanic
				oil change
				jump start
			}
		}


abstract method: a method without the implementation  (body)
				method that's meant to be overriden ( cannot be static, final, private)

				public abstract return-type  methodName();

				if the sub class of abstract class is none abstract, then sub class MUST override the abstract method

		two ways to achive abstraction is : 1. Abstract class
											2. Interface

Abstract class: a class that's meant to be inherited  ( abstract class cannot be  cannot be final)

		not  concrete: cannot create object from abstract class







 */