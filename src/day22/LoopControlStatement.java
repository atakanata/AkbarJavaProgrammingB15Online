package day22;

public class LoopControlStatement {
    /*
    * Store this sentence in a variable msg
    I struggle with Java I Like Java I love Java Everything is Awesome!
    loop through each and every letter
    1, print every other letter
     meaning : skip a letter each time you go through the letter
        012345678901234
        I struggle with  -->> Isrgl ih
        USE CONTINUE FOR THIS TASK
        *
    2,  when you reach letter a break the loop
    *
    *
    OPTIONALLY ; BREAK WHEN YOU SEE 3RD A in case insensitive manner
    *
    * */
    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome! ";

        int charCount = msg.length();
        System.out.println("Character Count = " + charCount);

        //for (int idx = 0; idx <= charCount-1 ; idx++) {
        for (int idx = 0; idx < charCount; idx++) {

            if (idx % 2 == 1) {
                continue;
            }
            //System.out.println(idx + "  :   " +  msg.substring(idx , idx+1)  );

        }

        // Task 2
        for (int idx = 0; idx < charCount; idx++) {

            String currentChar = msg.substring(idx, idx + 1);

            if (currentChar.equalsIgnoreCase("J")) {
                break;
            }
            //System.out.println("currentChar = " + currentChar);

        }


        // Task 1 and 2 combined
        for (int idx = 0; idx < charCount; idx++) {
            // this is the code to skip odd number index letters
            if (idx % 2 == 1) {
                // this line will skip the rest and move to next iteration
                continue;
            }
            // this is storing each character as String
            String currentChar = msg.substring(idx, idx + 1);
            // this is checking the currentChar is J or j
            if (currentChar.equalsIgnoreCase("J")) {
                break;// this will stop the loop
            }
            // printing out index and the character at that index
            System.out.println(idx + " index "
                    + " : currentChar = " + currentChar);

        }


    }

}
