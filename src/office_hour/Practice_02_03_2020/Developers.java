package office_hour.Practice_02_03_2020;

public class Developers extends ScrumTeam {
    /*
    Inherited features:
                employeeName, jobTitle, salary

                getEmployeeInfo(
     */
    public Developers(String employeeName, double salary) {
        this.jobTitle = "Software developer";
        this.employeeName = employeeName;
        this.salary = salary;
    }


    @Override
    public void Demo() {
        System.out.println("Developer " + this.employeeName + " is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer " + this.employeeName + " attend the daily stand up");
    }


    public void fixingBugs() {
        System.out.println("Developer " + this.employeeName + " is crying");
    }

}
