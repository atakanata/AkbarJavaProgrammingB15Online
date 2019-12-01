package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // Count 1 to 5 then count 5 to 1
        // if I use (counter <= 5 ) as condition I will have these
        // -->>  iteration 1 :   1<=5  true
        // print 1   counter = 2
        // -->>  iteration 2 :  2<=5  true
        // print 2   counter = 3
        // -->>  iteration 3 : 3 <= 5 true
        // print 3   counter = 4
        // -->>  iteration 4 :  4 <= 5 true
        // print 4   counter = 5
        // -->>  iteration 5 :  5 <= 5 true
        // print 5   counter = 6

        // 6 <=5  FALSE -->> GET OUT OF THE LOOP


        int counter = 1;

        while (counter <= 5) {

            System.out.print(counter + " ");
            ++counter; // counter = counter + 1 ;

        }
        System.out.println();
        System.out.println("counter after increment = " + counter);  // at this point counter value is 6

        // now I want to count from 5 to 1 , using same counter
        // if I use (counter >= 1) as condition I will have these
        //       -->> 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1  true   0>=1 false!!

        // if I use (counter > 1) as condition I will have these
        // --->> 6>1  5>1  4>1  3>1  2>1  true   1>1 false!!


        while (counter > 1) {

            --counter;  // counter = counter - 1 ;
            System.out.print(counter + " ");

        }
        System.out.println();
        System.out.println("counter after decrement = " + counter);

    }

}
