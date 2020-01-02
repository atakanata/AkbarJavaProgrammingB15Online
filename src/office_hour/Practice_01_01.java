package office_hour;

public class Practice_01_01 {
    /*
    methods practice:

    methods: grouping a series of statements


    1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
    Ex:
	    RemoveDuplicate("aaabbbccc") ==> "abc"

    2. write a return method called Frequency that accepts String and  char, the method will return the total number of ocuurence of the given char in the given string
    Ex:
	    Frequency("AAABBB", 'A') ==> 3

    3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
    Ex:
	    FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"

     */

    public static void main(String[] args) {
        String str = "AABBDDEE"; // expected result: ABDE

        String result1 = ""; // store non duplicates
        // result: "ABDE"

        for (int i = 0; i < str.length(); i++) {
            /*
            if( ! result1.contains(str.substring(i, i+1)) ) {
                 result1 += str.substring(i, i + 1);
                 //                      (0, 1) ==>A at index 0
                //                       (1, 2)  ==> A at index 1
            }

             */
            if (!result1.contains("" + str.charAt(i))) {
                result1 += "" + str.charAt(i);
            }


        }


        String str2 = "CCDDEE";


        System.out.println(result1);


        System.out.println(RemoveDup("MMMNNNBBBCCCC"));
        System.out.println(frequency("CCCACCCCABBCC", 'C'));

        System.out.println(frequencyOfChars("AABBBCCCAAAAA"));

    }

    // task1:
    public static String RemoveDup(String str) {
        String result1 = ""; // store non duplicates

        for (int i = 0; i < str.length(); i++) {

            if (!result1.contains("" + str.charAt(i))) {
                result1 += "" + str.charAt(i);
            }
        }

        return result1;
    }


    //Task02:  Frequency( "AAABBBBBB" , 'B') ==> 6

    public static int frequency(String str, char ch) {
        //"ABCABC"   'A'
        int count = 0; // count how many time the char is occured in str
        char[] arr = str.toCharArray(); // ['A', 'B', 'C', 'A', 'B', 'C']
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }

    //Task03: frequencyOfChars( "AAABBBCCC" )  ==> A3B3C3
    // ABC
    // A3B3C3
    public static String frequencyOfChars(String str) { // "AAABBBCCC"
        String result = "";
        String nonDup = RemoveDup(str); // ABC

        for (int i = 0; i < nonDup.length(); i++) {
            int count = frequency(str, nonDup.charAt(i));  // 3
            result += "" + nonDup.charAt(i) + count;
            //  'A' + 3
        }

        return result;
    }


}
