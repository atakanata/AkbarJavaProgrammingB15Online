package day57;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Hello B15 Online Friends!");
        //int num = 2.5; COMPILE ERROR
        int[] nums = new int[3]; // 0, 1, 2
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        //nums[3] = 200; //ArrayIndexOutOfBoundsException is thrown here.
        //System.out.println("Bye Bye B15 Online Friends!");//This Line does not run
        int result = 10 / 0; // ArithmeticException
        System.out.println("result is " + result);
    }
}

