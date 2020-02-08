package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseRunner {

    public static void main(String[] args) {

//        List<String> lst =
////                new ArrayList<>(Arrays.asList("Muge", "Sumeyye","Hasan","Astrit","Vlad","Zehra") ) ;
////
////        Course java = new Course("Java",lst) ;

        Course java = new Course("Java",
                new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Astrit", "Vlad", "Zehra")));

        //System.out.println("java before adding = \n" + java);
        java.addStudent("Gail");
        java.addStudent("Mohammed");

        java.addManyStudents(Arrays.asList("Serife", "Israfil", "Toyly"));

        //System.out.println("Course java = \n" + java);
        System.out.println("java.studentNames = " + java.studentNames);

//        java.studentNames.add("Gail");
//        java.studentNames.add("Mohammed");
//        java.studentNames.add("Ayjeren");
//        java.studentNames.add("Ayse");
//        java.studentNames.addAll( Arrays.asList("Serife","Israfil","Toyly") );


    }

}
