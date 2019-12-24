package office_hour;

public class Practice_12_23 {

    public static void main(String[] args) {
        //method it's just a reusable peace of code
        //with return type and without (void)
        //method can be with parameter/s or without

        String word = "computer";

        System.out.println(reverseString("true"));
        System.out.println(reverseString("word"));

        String result = reverseString(word);

        System.out.println(result);

    }

    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

}
