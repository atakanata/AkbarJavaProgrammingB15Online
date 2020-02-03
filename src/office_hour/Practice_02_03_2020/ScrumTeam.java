package office_hour.Practice_02_03_2020;

public abstract class ScrumTeam {

    public String employeeName;
    public String jobTitle;
    public double salary;


    public abstract void Demo();

    public abstract void DailyStandUp();

    public void getEmployeeInfo() {
        System.out.println("========================================================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("salary: " + salary);
        System.out.println("========================================================");
    }

}


/*
Task:
	create an abstract class called ScrumTeam:

			Data: employeeName, jobTitle, salary

			actions (Abstract):  Demo();
					 			 DailyStandUp();
			instance method:
					 employeeInfo(): prints employeeName, Job Title, employee salary

	create the following sub classes of ScrumTeam:
			1. Testers:
						actions: foundBug()

			2. Developers: job title by default should be software developer
						actions: fixingBug()

	create class capitalOne:
			create List of Testers, and store two objects of Testers class
			create List of Developers, and store two objects of Developers class
			create List of ScrumTeam, and store the list of Testers and Developers

			use for each loop to print out each of the scrum team member's EmployeeInfo
 */