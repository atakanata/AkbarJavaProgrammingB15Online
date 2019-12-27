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
