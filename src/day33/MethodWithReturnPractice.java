package day33;

/**
 * Practicing method with return type
 *
 * @author Akbar
 */
public class MethodWithReturnPractice {

    public static void main(String[] args) {
        // 1 + 2 + 3 + 4 + 5 + 6 = 21
        System.out.println(getSumFrom1toX(6));

        System.out.println(build_GOT_Email("Arya", "Stark"));
        System.out.println(build_GOT_Email("Sam", "Tarly"));

        // you are given a variable fullName that has first name and last name
        // use this full name to generate GOT_Email
        String fullName = "Susan cure";
//        String part1 = fullName.split(" ")[0]  ;
//        String part2 = fullName.split(" ")[1] ;
//          store this resulting email
//        String herEmail =  build_GOT_Email(part1,part2) ;

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_GOT_Email(fullNameSplit[0], fullNameSplit[1]);

        System.out.println("herEmail = " + herEmail);


    }

    /**
     * getSumFrom1toX
     * This method should calculate the sum of
     * the numbers from 1 to the positive number user passed.
     * including the number itself
     *
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */
    public static int getSumFrom1toX(int x) {
        int sum = 0;
        //TODO: YOUR CODE GOES HERE
        for (int i = 1; i <= x; i++) {
            sum += i; // sum = sum + i ;
        }
        return sum;
    }


    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial + lastName + @NightWatch.com
     */
    public static String build_GOT_Email(String firstName, String lastName) {

//        String email = firstName.charAt(0) + lastName + "@NightWatch.com";
//        return email ;
        return firstName.charAt(0) + lastName + "@NightWatch.com";
    }


}
