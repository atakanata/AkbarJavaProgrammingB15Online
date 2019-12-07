package day21;

public class DecidingWhenToStop {


    public static void main(String[] args) {

        String msg = "Hello World";

        int charCount = msg.length();

        int n = 7;

        //  x <= charCount-n

        for (int x = 0; x <= charCount - n; x++) {

            System.out.println(msg.substring(x, x + n));

        }


    }


}
