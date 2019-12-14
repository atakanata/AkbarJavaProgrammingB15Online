package day26;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray() , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();

        // how did determine to use char for each ??
        // because each item in char array is char
        // using for each loop
        for (char each : surveyChars) {

            System.out.println("each char is :   " + each);

        }
        // using for loop
        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println("each char is : " + surveyChars[i]);
        }

        // just for fun why dont we try while loop

        int x = 0;
        while (x < surveyChars.length) {

            System.out.println("each char is : " + surveyChars[x]);
            x++;
        }

        // for fun do while
        int y = 0;
        do {

            System.out.println("each char is : " + surveyChars[y]);
            y++;

        } while (y < surveyChars.length);


    }

}
