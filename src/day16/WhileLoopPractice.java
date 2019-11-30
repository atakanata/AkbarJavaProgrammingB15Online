package day16;

public class WhileLoopPractice {


    public static void main(String[] args) {


        int x = 100;

        while (x <= 105) {

            System.out.println("Hello World");
            x++;  // It will increase the value by 1 next time the x shows up
            //++x ;  // it will increase the value by 1 right away

        }
        /*
         **   iteration 1     x = 100
         *
         *      check 100<=105 -->> true
         *          "Hello World"
         *          x = 101
         *
         **   iteration 2   x = 101
         *
         *       check 101<=105 -->> true
         *        "Hello World"
         *          x = 102
         *
         **   iteration 3    x = 102
         *
         *        check 102<=105 -->> true
         *        x = 103
         *
         **   iteration 4  x = 103
         *
         *       check 103<=105 -->> true
         *        x = 104
         *
         **   iteration 5   x = 104
         *
         *       check 104<=105 -->> true
         *        x = 105
         *
         *    iteration 6
         *
         *       check 105<=105 -->> true
         *        x = 106
         *
         *   iteration 7
         *
         *       check 106<=105 -->> FALSE
         *
         *       GET OUT OF THE LOOP
         *
         * */


    }


}
