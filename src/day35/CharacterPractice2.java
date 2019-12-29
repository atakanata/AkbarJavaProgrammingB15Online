package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        char myChar = '7';
        // get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("myNum = " + myNum);

        // Character.toString(myChar)
        // String.valueOf(myChar)


        String str = "A34B123C4X";
        //for each char in string check if it is number
        // if yes store in a String and use that string to get Integer
        // then sum it up
        char[] allChars = str.toCharArray();

        int sum = 0;
        for (char each : allChars) {
            //  checking whether each char is a number or not
            if (Character.isDigit(each)) {
                // if it's print out to see
                System.out.println("each = " + each);
                // then turn it into int using parseInt method
                // parseInt only accept String
                // so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(each + "");
                // now we can numerically add the number to sum
                sum = sum + eachNum;

            }
        }
        System.out.println("sum = " + sum);
        // for loop version
        int sumForLoop = 0;
        for (int x = 0; x < str.length(); x++) {
            //isDigit accept char  // each char
            if (Character.isDigit(str.charAt(x))) {
                // appending number character to the result numsInStr
                sumForLoop += Integer.parseInt(str.charAt(x) + "");
            }

        }
        System.out.println("sumForLoop = " + sumForLoop);

    }

}
