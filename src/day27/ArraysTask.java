package day27;

public class ArraysTask {


    public static void main(String[] args) {
    /*
        Task01:
                write a program that can find the minimum number for an array
                    DO NOT use sort method

                 write a program that can find the second minimum number for an array
                    DO NOT use sort method

                write a program that can find the third minimum number for an array
                    DO NOT use sort method
     */

        int[] scores = {100, -99, -1000, 2000, 5000, 0, 1, 2000};
        int min = scores[0];     // min: 32

        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }

        System.out.println("minimum number: " + min);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
                /*
                if(scores[i] == min ){
                    continue;
                }

                 */
            if (secondMin > scores[i] && scores[i] != min) {
                secondMin = scores[i];
            }

        }
        System.out.println("second minimum number is: " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            /*
            if(scores[i] == min || scores[i] ==secondMin){
                continue;
            }

             */

            if (thirdMin > scores[i] && scores[i] != min && scores[i] != secondMin) {
                thirdMin = scores[i];
            }

        }

        System.out.println("third minimum number is: " + thirdMin);


    }
}
