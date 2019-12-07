package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {

        // continue
        // if line contains continue reaches,  the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop

        for (int x = 1; x <= 10; x++) {

            if (x % 2 == 1) {
                continue; // when this line reaches it goes back to line 12
            }

            System.out.println(x);

        }


    }

}
