package day39;

public class StudentCreation {

    public static void main(String[] args) {

        // how do we create an object out of template
        Student s1 = new Student();
        // set the values for s1 object attribute
        s1.name = "Karima";
        s1.age = 18;
        s1.gender = 'F';
        // get the values for s1 object attribute
        System.out.println("s1 name " + s1.name);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println("s2 age " + s2.age);
        // I want to save Juma's afe before I change so i still have access

        int oldAge = s2.age;

        s2.age = 28;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);

        System.out.println("Juma's old Age = " + oldAge);
        // tell me the different between old age and new age

        System.out.println("The differerence is " + (oldAge - s2.age));

    }

}
/*
*
Variable types :
according to what kind of data it store :
	primitive variable -->> pure value
	reference variable -->>
					the pointer to the object in the heap
					the address of the obejct in the heap
					remote of the TV
					leash of the dog

according to the location it shows up :

	 inside method : --> local variable
	 inside ( ) of method header -->>
	 				method parameter

	 outside method inside class
	 		--> Field
	 			instance field or instance variable
	 			static filed (will learn later)



* */
