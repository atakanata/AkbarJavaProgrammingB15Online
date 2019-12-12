package day25;

import java.util.Arrays;

public class String_BeforeToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya";

        // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn
        char[] namesChars = new char[6]; //name.length()

//        namesChars[0] = name.charAt(0);
//        namesChars[1] = name.charAt(1);
//        namesChars[2] = name.charAt(2);
//        namesChars[3] = name.charAt(3);
//        namesChars[4] = name.charAt(4);
////      namesChars[5] = name.charAt(5);

        // using for loop to fill up the array one by one
        for (int x = 0; x < namesChars.length; x++) {
            // take each character of name and fill the char array values
            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));


        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));


    }


}
