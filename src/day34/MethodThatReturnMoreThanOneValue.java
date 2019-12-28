package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        char[] eachChars = sentence.toCharArray();
        String[] eachWords = sentence.split(" ");

        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    // create a method that return int array retunrBoysVSGirlsResult
    public static int[] returnBoysVSGirlsResult() {
        // after fierce competition
        int[] boysGirlsCount = {57, 57};
        return boysGirlsCount;


    }


}
