package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";


        // Get the frequency and store into map   <Character, Integer>
        // if we do not have the character
        // we will enter character in char column
        // and enter the count as 1

        // if we have the character
        // increase the existing count by 1
        // and replace the value with new value
        Map<Character, Integer> charFreq = new HashMap<>();

        for (int x = 0; x < str.length(); x++) {

            char currentChar = str.charAt(x);
            // if we do not have the key yet , it means we are entering for the first time
            // the count will be 1
            if (!charFreq.containsKey(currentChar)) {
                System.out.println("Entering for the first time " + currentChar);
                charFreq.put(currentChar, 1);

            } else {
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
                System.out.println("Incrementing the count of " + currentChar + " by one and replacing old count");
                charFreq.replace(currentChar, charFreq.get(currentChar) + 1);

            }
        }
        System.out.println("charFreq = " + charFreq);


    }


}
