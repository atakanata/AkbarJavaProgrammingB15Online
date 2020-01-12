package day40;

public class HotMarketAction4 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        String o1Str = o1.toString();
        System.out.println("o1Str = " + o1Str);

        System.out.println(o1.toString());
        // if you directly print out object , it will call toString() method automatically
        System.out.println(o1); // this is what is automatically happening behind the scene o1.toString()


        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;

        Offer o4 = new Offer();

    }

}
