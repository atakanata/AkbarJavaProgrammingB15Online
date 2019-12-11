package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores4 = {6, 5, 6, 7, 3, 2, 34}; // it has same numbers as 3 but different order

        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);
        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)
        boolean isS1S2Equals = Arrays.equals(scores1, scores2);
        System.out.println("does score1 has same content as score2  = " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1, scores3);
        System.out.println("does score1 has same content as score3  = " + isS1S3Equals);

        boolean isS3S4Equals = Arrays.equals(scores3, scores4);
        System.out.println("does score3 has same content as score4  = " + isS3S4Equals);

        System.out.println("Sorting score 3 and score 4 then compare equality ");
        Arrays.sort(scores3);
        Arrays.sort(scores4);

        isS3S4Equals = Arrays.equals(scores3, scores4);
        System.out.println("AFTER SORTING : does score3 has same content as score4  = " + isS3S4Equals);


    }


}
