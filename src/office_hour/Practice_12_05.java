package office_hour;

public class Practice_12_05 {

    public static void main(String[] args) {
        // if statement:

        int a = 9;
        while (a > 0) {   // false: a <= 0
            //a:  9, 8, 7, 6, 5, 4, 3, 2, 1
            System.out.println("Hello Batch 15");
            a--;  // a1 = 8
        }

        System.out.println("===============================");

        for (int i = 9; i > 5; i--) {   // i: 9, 8, 7, 6
            System.out.println("Hello Batch 15");
        }

        System.out.println("===============================");

        // Task: 10 ~ 20

        // for loop:
        for (int i = 10; i <= 20; ) {
            System.out.println(i); // 11, 12 .. 21.
            i++;
        }
        System.out.println("===============================");


        // while loop:
        int j = 10;
        while (j <= 20) {

            System.out.println(j);
            j++;
        }

        System.out.println("===============================");
        do {
            System.out.println("hello batch 15");
        } while (9 > 10);

        System.out.println("===============================");
        int z = 10;
        do {

            System.out.println(z); //11
            z++;
        } while (z <= 20);


    }

}
