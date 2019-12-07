package day21;

public class CountSomethingInString {

    public static void main(String[] args) {


        // Find out the count of all the word lia in cases insensitive manner
        // I will go through each and every letter of the String  by 3 chars  '
        //                  --->> each 3 characters i can use substring(0,2) and so on
        //                  --->> going to 0 to two character before last char index  --->>> for loop

        // while i am going through each and every 3 characters
        // i will check whether current string i am looking at
        //  equals to <lia> in case insensitive     --->>>  currentCharacter.equalsIngnoreCase("lia")
        // if it is  I will add 1 to my counter
        //  if not  -->> just move on
        // perform this action until I reach two character before last character
        //  because last chance to get 3 characters is -->> 2 characters before last character


        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia  Ashr Behlia";

        int charCount = myName.length();   // character count
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;  // last character index is always 1 less than character count
        System.out.println("lastCharIndex = " + lastCharIndex);

        // counting something , always create a variable to store the count as int
        int counter = 0;

        System.out.println("---counting certain 3 chars ---");
        //for (int x = 0; x < charCount-3 ; x++) {  // will do the same in different way
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current3Chars = myName.substring(x, x + 3);
            // increase the count only if the 3 characters you are going through is what you are checking for
            if (current3Chars.equalsIgnoreCase("lia")) {
                // this is the code to actually increase the count by one
                ++counter; //counter = counter + 1 ;    //counter +=1 ;   //counter++ ;
            }

        }
        // printing out the final result as one.
        System.out.println("counter = " + counter);

    }


}
