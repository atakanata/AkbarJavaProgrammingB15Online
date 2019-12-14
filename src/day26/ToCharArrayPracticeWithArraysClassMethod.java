package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray() , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println("BEFORE surveyChars : " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);

        System.out.println("AFTER surveyChars : " + Arrays.toString(surveyChars));

    }

}
