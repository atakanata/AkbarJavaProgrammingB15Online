package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
        // if line contains break reaches, the loop will stop !!!


//        for (int i = 1; i <= 10  ; i++) {
//
//            System.out.println(i);
//            break;
//
//        }

        // while iterating over 1 to 10
        // break out of the loop when it's 5

//        for (int i = 1; i <= 10 ; i++) {
//
//            System.out.println(i);
//            if(i==5){
//                break ;
//            }
//
//        }


        int sum = 0;

        for (int x = 1; x <= 10; x++) {

            System.out.println("current sum is " + sum);

            // here we are checking whether after adding the next number
            // it will go over 40 or not ,
            // that's why we should use sum + x to see whether it will go over before we acrually add them
            if (sum + x > 40) {
                break;
            }
            // we need to add the sum after we make sure it did not go over 40
            sum = sum + x;

        }
        System.out.println("sum = " + sum);


        // continue
        // if line contains break reaches,  the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop


    }


}
