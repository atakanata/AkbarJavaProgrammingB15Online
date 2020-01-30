package day50;

public class Multiplication extends Question {

    public Multiplication(int num1, int num2) {

        super("Multiplication Question", "x");
        this.num1 = num1;
        this.num2 = num2;

    }


    @Override
    public void calculate() {
        answer = num1 * num2;
        calculated = true;
    }

    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }

    }

}
