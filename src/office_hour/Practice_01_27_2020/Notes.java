package office_hour.Practice_01_27_2020;

public class Notes {
    /*
    01/27/2020
Practice Topics: 1. final keyword
				 2. this & super keywords

final keyword: constant,  immutable
		only applicable:
			1. variables: cannot be changed (re-assigned)
						instance & static variables need to be initialized immedietly

						if the instance variables is private & final, we can only generate getter


			2. methods: the implementation/functionality can not changed. (cannot be overriden)


			3. class (none abstract): immutable class
					cannot be super class ( cannot be inherited)
					but can be sub class


object instances: contsructor, instance variables, instance methods

this: refers to the objects instances ( from current class)
	this. : calls the instance variables and instance methods


	this(): calls the constructor

	cannot be used in static methods and static blocks


super: refers to the object instances ( from super class)
		there must an inheritance relationship

	super. : calls the instance variables and instance methods ( from super class)

	super(): calls the constructor ( from super class)


	cannot be used in static methods and static blocks



this() & super() rules:
				1. only a constructor can call another constructor

				2. constructor cannot be called by thier names
						we need to use this() or super() to call

				3. constructor call MUST be at the first step in constructor's body

				4. A constructor cannot call more than one constructor

				5. Constructor cannot call or contain itself

				6. super class' constructor Must be called in sub class

				7. super class' default constructor is called by default in sub class


constructor rules:
		1. constructor cannot be overriden, but can be overloaded
		2. Constructor' execution ALWAYS depends on the object
		3. Every class must have constructor
		4. Constructor name MUST be same with class Name
		5. constructor does not have return type or specifiers
		6. class object MUST be created with existing constructor







     */
}
