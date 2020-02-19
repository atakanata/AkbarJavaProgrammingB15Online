package office_hour.Practice_02_18_2020;

public class excaptionReview {

    public static void main(String[] args) throws Exception {

        //   hi();
        //  test1();
        test3();

        //IDE

        //JAVA COMPILER

        int num = 9;

        //my code does not compile
        System.out.println(num);


        //Exceptions :
        //1. Compile time exception == checked exception
        //     right after you write code, JavaC checks syntax
        short i = 4;

        //2. Runtime Exception  == unchecked
        //     JRE jvm libraries run your code,

        //  String word = "java";
        //  System.out.println(word.charAt(6));

        // 2 ways to handle exceptions
        //1. try catch

        try {
            String word = "java";
            System.out.println(word.charAt(6));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Please take a look at index of the string");
        } catch (Exception e) {
            System.out.println("mom exception catch it");
        } finally {
            System.out.println("this runs no matter what on the above ");
        }
//when you run catch blcok, is it genral to spesific OR spesific to general ? child to parent

        //2. throws key word
        // mainly used for methods


        //throw key word : it comes with new key word , throw new exception

    }

    public static void test1() throws Exception {
        String name = "Cybertek";
        System.out.println(name.charAt(20));
    }

    public static void hi() throws Exception {
        System.out.println("hi hi ");
        test1();
    }


    public static void test2() {
        //I write some code, and I think it relates to math,
        //and I want to throw Arithmetic exception

        throw new ArithmeticException();  //I am not handling , I am throwing exception
    }

    public static void test3() {
        test2();
    }


}
