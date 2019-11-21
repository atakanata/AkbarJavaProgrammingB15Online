package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        // At the McDonald Drive thru
        System.out.println("Welcome to McDonald , what can I get for you");

        /*
         * 11, Burger
         * 5, French Fry
         * 8, Nuggets
         * 35, Ice Cream
         *   */
        String order = "";
        int itemNumber = 11;
        // what data type of variable I can use her e
        // byte , short , int , char , String
        switch (itemNumber) {

            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break; // if break does not show up here
            // it will just move on to next case
            case 5:
                System.out.println("You have selected 5");
                order = "French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                System.out.println("YAY!!! YUM!!! ");
                System.out.println("ENJOY!!!! ");
                order = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED Unknown ITEM NUMBER@!!");
                order = "Unknown";
                break;
        }
        System.out.println("Your order is " + order);


    }

}
