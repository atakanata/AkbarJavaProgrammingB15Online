package day40;

public class HotMarketActions2 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer o4 = new Offer();
        o4.displayInformation();

        // Add 2K to the Amazon offer
        //o3.salary = 96000 + 2000 ;

        o3.salary = o3.salary + 2000;
        o3.salary += 2000;
        System.out.println("New Amazon Salary = " + o3.salary);

        // set the salary value of o4 offer object to sum of all the offers
        o4.salary = o1.salary + o2.salary + o3.salary;
        o4.displayInformation();
        o4.turnToFullTime();
        o4.displayInformation();


    }

}
