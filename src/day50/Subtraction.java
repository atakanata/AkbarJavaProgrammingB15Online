package day50;

public class Subtraction extends Question {


    public Subtraction(int num1, int num2) {

        super("Subtraction question", "-");
//        this.num1 = num1 ;
////        this.num2 = num2 ;
        // need to make sure num1 is always more than num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // after making sure num1 is more than num2 then we set the field value
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate() {
        answer = num1 - num2;
        // calculated is the instance field to keep track of the Question
        // is calculated or not
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
