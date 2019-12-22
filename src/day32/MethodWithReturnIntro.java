package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        // System.out.println( Arrays.toString(arrayObjectHere) ) ;
        // just like we can directly use the toString method above and print the value
        // we can print the result of a method call directly , if the method return a value
        System.out.println("result of doubling 100 is " + doubleTheNumber(100));
//        System.out.println( doubleTheNumber(5)  );
//        System.out.println( doubleTheNumber(15)  );

        int add14to16Result = add2Numbers(14, 16);
        System.out.println("add 14 to 16 Result = " + add14to16Result);

        System.out.println(add2Numbers(14, 16) + 5);

    }

    // create a method called add , accept 2 int parameter
    // and return the result as int
    //
    public static int add2Numbers(int num1, int num2) {
        // int sum = num1+num2;
        // return sum ;
        return num1 + num2;

    }
    // doubleTheNumber
    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    // whole purpose of writing a method that return a value
    // so we can save the result after calling the method
    // and use it somewhere else
    public static int doubleTheNumber(int num) {

        //System.out.println("I am going to double the value of " + num);
        int result = num * 2;
        return result;

    }


    // i want to create a static method called giveMeMyName
    // it returns your name as a result
    // it has no parameters
    public static String giveMeMyName() {
        // assume getting my name
        // is multi steps complex operations
        return "Akbar";

    }

}
