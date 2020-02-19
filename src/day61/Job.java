package day61;

// Comparable interface is coming from java.lang package
// in order to sort a type , it has to be Comparable
// so the class of that type must implements Comparable<Type>
// to provide comparing logic , this will become natural order for sorting

// POJO : Plain Old Java Object | Usually used to represent data
public class Job implements Comparable<Job> {

    private String location;
    private double salary;
    private String companyName;

    public Job(String location, double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }


    @Override
    public int compareTo(Job other) {

        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
