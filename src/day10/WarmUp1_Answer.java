package day10;

public class WarmUp1_Answer {

    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 46;

        if (myNumber % 5 == 0) {
            myAnswer = "Fizz Number";
        } else {
            myAnswer = "not a Fizz Number";
        }

        System.out.println("print my number is " + myNumber + " , It is  " + myAnswer);
    }


}
