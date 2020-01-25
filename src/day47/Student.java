package day47;

public class Student {

    // public final static field  with initial value set
    // This type of field name always suggested to make all uppercase
    // to make it clear that this is a public static final field that never change
    // other languages has specific term called CONSTANT for this
    // If interviewer asks how do I define CONSTANT in java ?
    // you would say Will create public static final field
    public static final String SCHOOL = "Cybertek";
    // final  INSTANCE FIELD
    final int studentID;

    public Student(int studentID) {
        this.studentID = studentID;
    }

}
