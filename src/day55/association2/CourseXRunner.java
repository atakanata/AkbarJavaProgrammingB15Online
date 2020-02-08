package day55.association2;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {


    public static void main(String[] args) {

        List<Student> myLst = new ArrayList<>();
        myLst.add(new Student("Muge", 101));
        myLst.add(new Student("Hasan", 102));
        myLst.add(new Student("Astrist", 103));
        myLst.add(new Student("Vlad", 104));
        myLst.add(new Student("Zehra", 105));
        myLst.add(new Student("Ayjeren", 106));


        CourseX java = new CourseX("HAS-A", myLst);

        java.addStudent("Goksel", 110);
        java.addStudent(new Student("Dilshat", 111));

        System.out.println("java = " + java);


    }


}
