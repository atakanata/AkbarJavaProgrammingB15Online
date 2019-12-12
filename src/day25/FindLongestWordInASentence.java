package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {

        String sentence = "We All Love Java Coding intensively all the time";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));
        // first create a String variable longestWord to store my result
        //  also create maxCharCount variable to store my longest char count
        // I want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        // if it's I will assign the longest word value to current word i am looking at

        String longestWord = "";
        int maxCharCount = 0;

        for (String currentWord : allWords) {

            //System.out.println("currentWord = " + currentWord);
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }

        }
        System.out.println("longestWord = " + longestWord);


    }


}
