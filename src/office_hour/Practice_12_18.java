package office_hour;

public class Practice_12_18 {

    public static void main(String[] args) {

        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
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


    }

}
