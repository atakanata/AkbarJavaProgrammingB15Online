package office_hour;

public class Practice_12_27 {

    /*
    access-modfiers  specifiers  return-Type  name(parameters){
				statements...;
		}
     */

    public static void main(String[] args) {
        String a = "ABCDEFG";
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.substring(i, i + 1));
        }
        System.out.println();

        String a1 = "Esra Fidan";

        method2();

        long num1 = 10;
        double num2 = num1;

        double number1 = method3();
        method2();

        System.out.println(Eligible(10));
        System.out.println(Eligible(45));

    }


    public static void method1() {
        System.out.println("Hello Batch 15");
        //  return 10; // return type is void, cannot return any value
    }

    public static void method2() {
        if (false) {
            return;  // exits the current method
        }
        System.out.println("Test completed");
    }

    public static double method3() {
        // if return type is not void, the method MUST return a value at the end
        return 10.5f;
    }


    public static boolean Eligible(int age) {
        if (age >= 35) {
            return true;
        }

        return false;
    }


}

/*
class notes:
12/27/2019
Practice topic: Methods

methods: grouping a series of statements together to perform a specific action

		methods can make our codes more reusable (don't need to repeat same set of statements)


method Decleration:

		access-modfiers  specifiers  return-Type  name(parameters){
				statements...;
		}

		during this course:
			access-mdofiers: public, protected, default, private

			specifiers: static, final, abstract

			return-type(mandatory): void, any  data-types(all primitives or non primitives)

			parameters: any  data-types(all primitives or non primitives)


		for Now we will only use public and static for the access midifier and specifier


		if return-type is void: does not return any value

		if return type is not void: the method MUST return a value
									the returning value MUST be matched with the return-type of the method


		Methods with parameters: sometime method needs specific information (from the user) to perform its function

			the argument that we are passing MUST match with parameter's data type


return statement: it's used for exiting the current method.  we can also use return statement to return a vlaue from the method


 */
