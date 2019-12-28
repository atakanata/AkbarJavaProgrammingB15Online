package day34;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        add(15);
        add(15, 45);
        add(15, 43, 67);
        add(15L, 23L);

    }

    public static void add(int a, int b) {
        System.out.println(a + b + "  calling add(int a, int b) ");
    }

    public static void add(int a) {
        // DO I ALREADY HAVE A METHOD THAT ADD 2 NUMBERS
        System.out.println(a + 100 + "  calling add(int i) ");
        //add(a,100); // we can do this to reuse functionality we already have
    }

    public static void add(long a, long b) {
        System.out.println(a + b + "  calling add(long a, long b)");
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c + "  calling add(int a, int b, int c) ");
    }


}
