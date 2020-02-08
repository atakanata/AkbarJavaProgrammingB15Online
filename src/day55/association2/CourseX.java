package day55.association2;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentLst;

    public CourseX(String topic, List<Student> studentLst) {
        this.topic = topic;
        this.studentLst = studentLst;
    }

    // version of add student that accept Student object
    public void addStudent(Student s) {

        studentLst.add(s);

    }

    // version of add student that accept Student name and id
    // so we can create object inside the method and add to the list
    public void addStudent(String name, int ID) {

        Student s1 = new Student(name, ID);
        studentLst.add(s1);

    }


    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentLst=" + studentLst +
                '}';
    }
}
