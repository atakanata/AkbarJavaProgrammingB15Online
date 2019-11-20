package day09;

public class DayPrinter {

    public static void main(String[] args) {

        /*
        create a variable called dayCode as int

        *  if the dayCode is 1 --->> Monday
        *  if the dayCode is 2 --->>Tuesday
        *  if the dayCode is 3 --->>Wednesday
         * if the dayCode is 4 --->>Thursday
         * if the dayCode is 5 --->>Friday
         * if the dayCode is 6 --->>Saturday
         * if the dayCode is 7 --->>Sunday
         * if none of the above just print unknown day
         *
        * */
        int dayCode = 77;

        if (dayCode == 1) {
            System.out.println("Day is Monday");
        } else if (dayCode == 2) {
            System.out.println("Day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println("Day is Wednesday");
        } else if (dayCode == 4) {
            System.out.println("Day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("Day is Friday");
        } else if (dayCode == 6) {
            System.out.println("Day is Saturday");
        } else if (dayCode == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println("Day is Unknown");
        }


    }

}
