package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        String sentence = "I love Java Java Java";

        String[] wordsArray = sentence.split(" ");

        System.out.println("wordsArray = " + Arrays.toString(wordsArray));


    }

}
