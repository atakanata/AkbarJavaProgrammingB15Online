package office_hour;

public class Practice_11_27 {

    /*
    *   equals
        equalsIgnoreCase
        length
        toUpperCase
        toLowerCase
        startsWith
        endsWith
        charAt
        contains
        indexOf
        lastIndexOf
        isEmpty
        trim
    * */

    public static void main(String[] args) {

        String message = "  I LOVE  JAVA   ";
        //trim -->> take out spaces at beginning and ending of a String object
        // IT DOES NOT TAKE OUT THE SPACE IN BETWEEN CHARACTERS !!!!!!
        System.out.println("message = <" + message + ">");

        String messageTrimmed = message.trim();
        System.out.println("messageTrimmed = <" + messageTrimmed + ">");


        //isEmpty   --->> Check whether a String object is empty , meaning there is nothing inside ""
        //  isEmpty =  yourString.length() == 0 -->> true
        String emptySpaces = "            ";
        System.out.println("emptySpaces = <" + emptySpaces + ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is  :  " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??? :  " + emptySpacesAfterTrimmed.isEmpty());

        // isEmpty VS isBlank method from String class
        // isEmpty -->>  if yourString.length()>0  false else it's true
        // isBlank -->>  if you have only white spaces , get true , else get false
        System.out.println("emptySpaces is blank or not ??   " + emptySpaces.isBlank());


        // indexOf --> give you location of the string you are looking for inside anotherString
        // for example yourString.indexOf("abc")                               01234567890123456
        // copied from above so we can see what we have  --> String message = "  I LOVE  JAVA   " ;

        int locationOfLove = message.indexOf("LOVE");
        System.out.println("location Of word Love = " + locationOfLove);

        // lastIndexOf --> give you last location of the string you are looking for inside anotherString
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("last IndexOf Letter A = " + lastIndexOfLetterA);

        // contains : -->> check whether a String exists inside another String and return true false
        //    contains works exactly same as  --->>> yourString.indexOf("anotherStr") > -1  or >=0
        boolean messageContainsLove = message.contains("LOVE");
        System.out.println("message Contains Love = " + messageContainsLove);


    }

}

