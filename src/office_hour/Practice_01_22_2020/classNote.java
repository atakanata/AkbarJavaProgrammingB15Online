package office_hour.Practice_01_22_2020;

public class classNote {

    /*
    01/22/2020
Practice Topic:
				1. Method Overriding
				2. overriding vs Overloading

visibility level of acccess modifier:
		public > protected > deafult > private


method overriding:  same method name, same parameter

			rules:
					1. Must be overridden in sub class (inherited relation)
								Method overriding can not take palce in the same class
					2. return-type, method name, parameter MUST be same
					3. Overridden' Access modifier MUST be same or more visible
							public > protected > default

					4. only instance method can be overridden( cannot be static, private)
					5. @Override Must be applicable


class car{
	start(){
		sout("started");
	}
}

class Toyota extends car{
	start(){
		sout("Key");
	}
}

class Tesla extends car{
	start(){
		sout("voice Control");
	}
}

class Jeep extends car{
	start(){
		sout("call machanic");
	}
}



why do we need method overriding?
	to provide different implementation(functionality) to the method




method overriding vs method overloading:

		method overloading: can happen in same class
							return-type can be different or same
							parameter MSUT be different
							any method can be overloaded


		method overridding: must happen in sub class only
							return-type must be same
							parameter MUSt be same
							access mdofiers of overridden method MUST be same or more visible
							Only instance method can be overriden ( cannot be static, private)



Task:
		create class bank:
				actions: interast rate calculation
							InterestCalculator(){}

		create sub classes:
				BOA: interest rate ==> 3%
				CapitalOne: interest rate ==> 4%
				Citi: interest rate ==> 5%







     */
}
