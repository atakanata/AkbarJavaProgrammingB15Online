package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        // Assignment Operator =
        // --> will save the result of whatever operation on the right side
        // and assign the result to the left side variable ;

        int studentOnline = 263;

        studentOnline = studentOnline + 5;

        System.out.println("5 people joined the class " + studentOnline);

        studentOnline = studentOnline - 3;

        System.out.println("3 people left the class " + studentOnline);

        studentOnline = studentOnline * 2;
        //studentOnline = studentOnline +  studentOnline ;

        System.out.println("the student count doubled " + studentOnline);

        studentOnline = studentOnline / 3;
        System.out.println("the student dropped to 1/3:  " + studentOnline);

    }


}
