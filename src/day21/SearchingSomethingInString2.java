package day21;

public class SearchingSomethingInString2 {

    public static void main(String[] args) {


        // Find out index of all the word an in cases insensitive manner
        // I will go through each and every letter of the String  by 2 chars  '
        //                  --->> each character i can use substring(0,2) and so on
        //                  --->> going to 0 to one character before last char index  --->>> for loop

        // while i am going through each and every 2 character
        // i will check whether current string i am looking at
        //  equals to <an> in case insensitive     --->>>  currentCharacter.equalsIngnoreCase("an")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach one character before last character
        //  because last chance to get 2 characters is -->> right before last character


        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---2 chars ---");
        //for (int x = 0; x < charCount-2 ; x++) {
        for (int x = 0; x <= lastCharIndex - 1; x++) {

            String current2Chars = myName.substring(x, x + 2);

            if (current2Chars.equalsIgnoreCase("ma")) {

                System.out.println("The index of an is " + x);

            }

        }


    }


}
