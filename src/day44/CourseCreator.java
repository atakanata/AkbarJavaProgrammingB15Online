package day44;

public class CourseCreator {


    public static void main(String[] args) {


        System.out.println("Course.counter = " + Course.counter);

        Course c1 = new Course("Java", "foundation");
        Course c2 = new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservices");
        Course c5 = new Course("Agile", "Soft Skills");
        Course c6 = new Course("AWS", "Cloud");


        System.out.println("Course.counter = " + Course.counter);


    }


}
