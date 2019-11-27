package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "I like Pumpkin";

        //System.out.println("str");
        System.out.println("str = " + str);


        //System.out.println(  str.equals("pumpkin")   );

        // contains :
        // it checks whether a string exists in another string'
        // and return true or false result
        System.out.println("Does it contains Pumpkin : ");
        System.out.println(str.contains("Pumpkin"));
        // true
        boolean gotPumpkin = str.contains("Pumpkin");
        //shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        //  PASSWORD VALIDATOR

        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START Ab

        // if any of above condition does not match say INVALID PASSWORD
        // else say  GOOD PASSWORD !
        String password = "ASH2723gfgdsu";
        // MINIMUM 8 CHAR MAX 16 CHAR
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;

        // IT MUST CONTAINS _ OR $
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        //

        // IT MUST NOT CONTAINS SPACE
        boolean mustNotContainsSpace = !password.contains(" ");
        //

        // IT MUST START Ab
        boolean mustStartsWithAb = password.startsWith("Ab");
        //

        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSOWRD");
        }


    }

}
