package office_hour;

public class Practice_12_18 {

    public static void main(String[] args) {

        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        //"Analiese Van der Brugge [Web Developer II] avanderbrugge6@yelp.com";
        //"Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        // print job title from this String :  Electrical Engineer

        // logic : title is in between [ and ]  so we need to find index of [ and ]
        // and use substring(right after index of [   ,  index of ]    )

        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex, endingIndex);
        System.out.println("title = " + title);

        /*
        * Print all FirstName-lastName jobTitle
       for example :
        Philipa-Salthouse Electrical Engineer
        Ulrika-Goolding Nuclear Power Engineer
        * */
        // "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co" ;

        // logic : get first name ( first word in this sentence)
//                 get last name ( second word in this sentence) put dash in between
//                 then concatenate with the title
        // this will break if we have name more than 2 words

        // logic 2 :  get the full name directly using subString
        //            replace all the space in full name with -
        //            then concatenate with the title
        String fullName = employee.substring(0, employee.indexOf(" ["));
        System.out.println("fullName = " + fullName);
        //  Philipa-Salthouse Electrical Engineer
        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);

        System.out.println(fullNameWithDash + " " + title);

        /*
        * //TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
        }
        * */
        /*  Given Expected Title for Philipa Salthouse is Electrical Engineer
         *  Write a if statement to test if it's correct or not
         * */
        if (title.equals("Electrical Engineer")) {
            System.out.println("PASS: Verification successful");
        } else {
            System.out.println("FAIL: Verification fail : " + title);
        }

        /*Task 4:  //Print Initials -> Job Title for everyone
         *
         PS -> Electrical Engineer*/

        // logic :   get the first word and last word of your full name and get first characters of both
        ///          a full name might contains more than 2 words but we only want 2 characters for initials
        // I already have variable fullname that contains fullname
        // Bruce D Wayne  -->> BW
        // get first character using charAt(0) ,
        // get lastname first character using charAt( lastIndexOfSpace +1    )
        System.out.println(fullName.charAt(0) + ""
                + fullName.charAt(fullName.lastIndexOf(" ") + 1)
                + " -> " + title);



    }

}
