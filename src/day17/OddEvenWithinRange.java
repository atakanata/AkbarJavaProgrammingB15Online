package day17;

public class OddEvenWithinRange {

    public static void main(String[] args) {

        // write a program to print out a even number from 0 to 50 ;
        // write a program to print out a odd number from 0 to 50 ;

        int cnt = 0;
        while (cnt <= 50) {

            System.out.print(cnt + " ");
            cnt += 2; // cnt = cnt + 2 ;

        }
        System.out.println("------------");

        int cnt2 = 1;
        while (cnt2 <= 50) {

            System.out.print(cnt2 + " ");
            cnt2 += 2;

        }

        System.out.println("------------");
        int cnt3 = 0;

        while (cnt3 <= 50) {

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;
        }


    }

}
