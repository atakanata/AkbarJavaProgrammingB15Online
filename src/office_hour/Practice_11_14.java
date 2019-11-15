package office_hour;


public class Practice_11_14 {

    public static void main(String[] args) {


        String name = "Isil";
        //System.out.println("my name is Isil");

        System.out.println("my name is " + name);
        //System.out.println("my name is " + "Isil");

        // From NYC to DC it takes 5 hours by bus ;

        String city1 = "NYC";
        String city2 = "DC";
        int hours = 5;

        System.out.println("From NYC to DC it takes 5 hours by bus");

        System.out.println("From " + "NYC" + " to " + "DC" + " it takes " + 5 + " hours by bus");

        System.out.println("From " + city1 + " to " + city2 + " it takes " + hours + " hours by bus");

        // ADDING ANY DATA TYPE TO A STRING WILL RESULT IN STRING

        System.out.println(city1 + 5);
        System.out.println(hours + 5);   // adding numbers to numbers generate another number
        System.out.println("5" + 5);    // adding String to a number or any data type will result in String

        // ------ Arithmetic operator
        System.out.println(5 + 5);


    }

}
