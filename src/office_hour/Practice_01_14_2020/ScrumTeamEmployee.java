package office_hour.Practice_01_14_2020;


public class ScrumTeamEmployee {

    //Scrum team employee's information  --> variable, field, attribute, data

    //SM, PO, developers + testers
    String jobTtile;
    String name;
    double salary;
    int employee_ID;
    int age;

    public static void main(String[] args) {

        System.out.println("Hello world ");

        int i = 9;
        String word = "java";  //local variable

        int number;
        //   System.out.println(number);  local filed should be initialized

    }

    //what can scrum team do? actions --> method
    public void standUP() {
        System.out.println("This team's stand up meeting is at 10:45 AM");
    }

    //create a method which give me all the information about an employee

    public void demo() {
        System.out.println(name + " is doing demo");
    }

    public void getEmployeeInfo() {
        System.out.println("Job Title: " + jobTtile + "\n" +
                "Employee ID: " + +employee_ID + "\n" +
                "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Age: " + age);
    }

    public void hi() {
        String name = "Asiya";   //local variable
    }


    public void hello(String name) { //local variable
        System.out.println("Hello " + name);
    }
}
