package day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown"; // setting default value to unknown directly here to avoid null

    public Question(String questionType, String operator) {
        this.questionType = questionType;
        this.operator = operator;
    }

    public abstract void calculate();

    @Override
    public String toString() {
        return "The question type is " + questionType + " : ";
    }

}
