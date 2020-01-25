package day47;

public class Practice {
    // this is not inherited
    private void doSomething() {

    }


}


class JavaPractice extends Practice {

    // this is just another method that happen to have same name
    private void doSomething() {

    }

}
/*
*


WHEN I MUST USE INSTANCE METHOD RATHER THAN STATIC ?

when you need to access or modify
the object's attribute (instance field)




Inheritance


IS-A Relationship :

public class Car{ }

public class ElectricCar extends Car{


}

-- THIS IS A VALID STATEMENT
ElectricCar is a Car

Dog is a Animal
Employee is a Person
SalariedEmployee is a Employee

--- THIS IS NOT VALID !!!
Car is a ElectricCar
Person is a Teacher


----  WE CAN INHERITE --
as long its visible|accessible

fields ( instance and static )
methods ( instance and static )

constructor is not inherited !!!!
how can we reuse the logic defined in super class constructor
we can call using super(arguments..)


method overriding :
sub class can override the content of
inherited super class instance method
to provide its own implementation

@Override is called annotation
it will ensure the method is correctly overrien once being used
and its optional to use
but highly recommended


// super class method
 private void doSomething(){
 	// doing bunch of stuff
 }

 // sub class method
 private void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS NOT OVERRIDING BECAUSE THEY DONT SEE EACH OTHER AT ALL
IT WILL COMPILE



// super class method
 void doSomething(){
 	// doing bunch of stuff
 }

 // sub class method
 private void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS NOT A VALID OVERRIDING BECAUSE ACCESS MODIFER
IN SUB CLASS SHOULD BE SAME OR MORE VISIBLE
default --->> default, protected , public


// super class method
 public void doSomething(){
 	// doing bunch of stuff
 }

 // sub class method
 public void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS VALID OVERRIDING



// super class method
 private void doSomething(){
 	// doing bunch of stuff
 }

 // sub class method
 //@Override /-->> error!!!!!!!
 public void doSomething(){
 	// doing bunch of stuff
 }
IS IT A OVERRIDING???  NO@@!!!!!!!
DOES IT COMPILE ???

*
* */
