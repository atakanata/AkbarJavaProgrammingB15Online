package office_hour;

public class Practice_12_17 {

    public static void main(String[] args) {
        //String method

        //data types : primitive       non-primitive
        /*
        primitive : byte short int long float double char boolean
        non-primitive : Scanner String Array
         */

        int number = 6;

        String word = "javajjj";

        //replace j -->c

        System.out.println("After repalce " + word.replace("j", "c"));


        System.out.println(word);  //java

        System.out.println("word"); //word

        System.out.println(number);  //6

        System.out.println(number + 6);    //12
        // 6 + 6 = 12

        //in order to see how many chars we have in a variable
        System.out.println("there are total " + word.length() + " chars in word");
        //8

        //
        System.out.println("I have 6" + 7);

        System.out.println("I have 9" + 1 + 2);

        System.out.println("I have 8" + (1 + 4));
        //I have 8         5

        System.out.println((2 + 3) + (3 + 5));
        //                    5   +   8 = 13

        //012345678910
        String book = "learn java in 1 day, java is fun";

        System.out.println("first j's index " + book.indexOf("j")); //6


        System.out.println("last j's index " + book.lastIndexOf("j"));


        System.out.println(book.length());

        //I want only one char --> l
        System.out.println(book.charAt(0));

        System.out.println("I am looking for a space " + book.charAt(5));

        //we can use subString method to get one or more chars
        String student = "Rabia";

        System.out.println(student.length());
        //5 ==> int
        int i = 9;
        int lengthOfStudent = student.length();
        //5
        //int lengthOfStudent =5;
        System.out.println(lengthOfStudent);  //5


        System.out.println(student.substring(2));

        System.out.println(student.substring(0, 1));

        System.out.println(student.substring(4)); //last a
        System.out.println(student.substring(4, 5)); //last a

        System.out.println(student.toUpperCase()); //RABIA

        System.out.println(student.toLowerCase()); //rabia ==> String

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);

        String batch = "Online";

        // uppercase + length
        System.out.println(batch.toUpperCase().length());
        //ONLINE
        System.out.println("Asiya".toUpperCase().toLowerCase().length());

        //trim
        String a = "  Asiya   ";
        System.out.println(a.trim().toUpperCase());  //Asiya


    }
}
